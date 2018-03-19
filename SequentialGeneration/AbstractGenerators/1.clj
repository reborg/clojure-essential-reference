(defn repeatedly* [f x] ; <1>
  (lazy-seq (cons (f) (repeatedly* f))))

(defn iterate* [f x] ; <2>
  (lazy-seq (cons x (iterate* f (f x)))))

(defn repeat* [x] ; <3>
  (lazy-seq (cons x (repeat* x))))

(defn cycle* [coll] ; <4>
  ((fn step [[x & xs]]
     (lazy-seq
       (if x
         (cons x (step xs))
         (cycle* coll)))) coll))

(defn range* [n] ; <5>
  ((fn step [x]
     (lazy-seq
       (when (< x n)
         (cons x (step (inc x)))))) 0))