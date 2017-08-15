(let [a false
      b true]
  (if a :a
    (if b :b
      (if :else :c))))
;; :b