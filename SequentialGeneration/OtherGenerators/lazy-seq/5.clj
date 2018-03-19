(defn eager-map [f coll] ; <1>
  (when-first [x coll]
    (println "iteration")
    (cons (f x)
          (eager-map f (rest coll)))))

(def eager-out (eager-map str '(0 1 2))) ; <2>
;; iteration
;; iteration
;; iteration

(defn lazy-map [f coll]
  (lazy-seq ; <3>
    (when-first [x coll]
      (println "iteration")
      (cons (f x)
            (lazy-map f (rest coll))))))

(def lazy-out (lazy-map str '(0 1 2))) ; <4>
(first lazy-out) ; <5>
"iteration"
"0"