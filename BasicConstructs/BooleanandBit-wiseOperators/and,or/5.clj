(defn and1 [a b c]
  (if a
    (if b
      (if c c))))

(defn and2 [a b c]
  (and a b c))

(defn or1 [a b c]
  (if a
    a
    (if b
      b
      c)))

(defn or2 [a b c]
  (or a b c))