(import '[java.util.concurrent LinkedBlockingQueue])

(def q (LinkedBlockingQueue. 2000)) ; <1>

(defn counter [] ; <2>
  (let [out *out*]
    (future
      (binding [*out* out]
        (dotimes [n 5]
          (Thread/sleep 1000)
          (println "buffer" (.size q)))))))

(defn file-scan [] ; <3>
  (->> (java.io.File. (System/getProperty "user.home"))
    file-seq
    (map (memfn getPath))
    (filter (by-type ".clj"))
    (seque q)))

(counter) ; <4>
(go)

;; ("/Users/reborg/.atom/packages/proto-repl/proto-no-proj/project.clj"
;;  "/Users/reborg/.atom/packages/proto-repl/proto-repl-client-cljs/dev/user.clj"
;;  "/Users/reborg/.atom/packages/proto-repl/proto-repl-client-cljs/project.clj"
;;  "/Users/reborg/.atom/packages/proto-repl/proto-repl-client-cljs/tests/edn_reader/test/display.clj"
;;  "/Users/reborg/.atom/packages/proto-repl/proto-repl-lib/dev/user.clj")
;; more?
;; buffer 544
;; buffer 745
;; buffer 745
;; buffer 749
;; buffer 749
n
nil