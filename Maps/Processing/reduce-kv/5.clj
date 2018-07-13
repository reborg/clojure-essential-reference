(import 'java.util.HashMap)

(extend-protocol clojure.core.protocols/IKVReduce ; <1>
  java.util.Map ; <2>
  (kv-reduce [m f init]
    (let [iter (.. m entrySet iterator)] ; <3>
      (loop [ret init]
        (if (.hasNext iter) ; <4>
          (let [^java.util.Map$Entry kv (.next iter)]
              (recur (f ret (.getKey kv) (.getValue kv))))
          ret)))))

(reduce-kv
  (fn [m k v] (assoc m (transform k) v))
  {}
  (System/getenv)) ; <5>

;; {:jenv-version "oracle64-1.8.0.121",
;;  :tmux "/private/tmp/tmux-502/default,2685,2",
;;  :term-program-version "3.1.5",
;;  :github-username "reborg"
;;  ...}

(reduce-kv
  (fn [m k v] (assoc m (transform k) v))
  {}
  (System/getProperties)) ; <6>

;; {:java.vm.version "25.121-b13",
;;  :java.specification.name "Java Platform API Specification",
;;  :java.io.tmpdir "/var/folders/25/T/",
;;  :java.runtime.name "Java(TM) SE Runtime Environment",
;;  ...}