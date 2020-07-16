(def counter (ref 0))

(defn f2 [value] ; <1>
  (io! (println "Sorry, side effect on" value))
  (inc value))

(defn f1 [] ; <2>
  (dosync (f2 (commute counter f2))))

(f1) ; <3>
;; IllegalStateException I/O in transaction  user/f2