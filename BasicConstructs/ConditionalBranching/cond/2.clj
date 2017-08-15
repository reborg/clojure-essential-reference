(let [a false
      b true]
  (cond
    a :a
    b :b         ; <1>
    :else :c))   ; <2>
;; :b