(defn ++ [v] ; <1>
  (var-set v (inc (var-get v))))

(defn count-even [xs] ; <2>
  (with-local-vars [a 0]
    (doseq [x xs]
      (when (zero? (rem x 2))
      (++ a)))
    @a))

(count-even (range 10)) ; <3>
;; 5