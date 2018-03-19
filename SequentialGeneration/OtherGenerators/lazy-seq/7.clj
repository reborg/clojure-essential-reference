(macroexpand ; <1>
  '(lazy-seq
      (when coll
        (cons
          (f (first coll))
          (lazy-map f (next coll))))))

;; (new clojure.lang.LazySeq
;;   (fn* []
;;     (when coll
;;       (cons
;;         (f (first coll))
;;         (lazy-map f (next coll))))))