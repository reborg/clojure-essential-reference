(import '[java.util.concurrent LinkedBlockingQueue])

(def q (LinkedBlockingQueue. 2000)) ; <1>

(defn counter [] ; <2>
  (let [out *out*]
    (future
      (binding [*out* out]
        (dotimes [n 50]
          (Thread/sleep 1000)
          (println "buffer" (.size q)))))))

(defn lazy-scan [] ; <3>
  (->> (java.io.File. "/")
    file-seq
    (map (memfn getPath))
    (filter (by-type ".txt"))
    (seque q)))

(counter) ; <4>
;; #object[clojure.core$future_call$reify__8454 0x4b672daa {:status :pending, :val nil}]
;; buffer 0
;; buffer 0
;; buffer 0

(go)

;; ("/usr/local/Homebrew/docs/robots.txt" ; <5>
;;  "/usr/local/Homebrew/LICENSE.txt"
;;  "/usr/local/var/homebrew/linked/z3/todo.txt"
;;  "/usr/local/var/homebrew/linked/z3/LICENSE.txt"
;;  "/usr/local/var/homebrew/linked/z3/share/z3/examples/c++/CMakeLists.txt")
;; more?

;; buffer 544 ; <6>
;; buffer 745
;; buffer 745
;; buffer 749
;; buffer 749
;; ...
;; buffer 2000
;; buffer 2000
;; ...