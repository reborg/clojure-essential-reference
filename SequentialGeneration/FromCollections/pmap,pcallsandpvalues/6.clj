(defn dechunk [xs] ; <1>
  (lazy-seq
    (when-first [x xs]
      (cons x
        (dechunk (rest xs))))))

(defn f [x] ; <2>
  (Thread/sleep (+ (* 10 x) 500))
  (println (str "done-" x))
  x)

(def s (pmap f (dechunk (range 100)))) ; <3>
;; done-0
;; done-1

(first s) ; <4>
0
;; done-2
;; done-3
;; done-4
;; done-5
;; done-6

(take 2 s) ; <5>
(0 1)
;; done-7