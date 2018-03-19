(defn get-batch [id] ; <1>
  (repeat id id))

(defn step
  ([n] (step n ()))
  ([n res]
    (if (pos? n)
      (recur (dec n) (concat res (get-batch n))) ; <2>
      res)))

(step 4) ; <3>
;; (4 4 4 4 3 3 3 2 2 1)

(first (step 10000)) ; <4>
;; StackOverflowError