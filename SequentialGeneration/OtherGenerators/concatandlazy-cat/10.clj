(defn step
  ([n] (step n ()))
  ([n res]
    (if (pos? n)
      (recur (dec n) (concat (get-batch n) res)) ; <1>
      res)))

(step 4) ; <2>
;; (1 2 2 3 3 3 4 4 4 4)

(last (step 10000))
10000