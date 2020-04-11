(ns user)

(defn clean-ns [ns] ; <1>
  (let [ks (keys (ns-map ns))]
    (doseq [k ks]
      (ns-unmap ns k))))

(ns myns)
(#'user/clean-ns 'myns)
(clojure.core/alias 'c 'clojure.core) ; <2>

(c/ns-map 'myns) ; <3>
;; {}