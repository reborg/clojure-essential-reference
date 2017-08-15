(defn f1 [a b c d]
  (+ a b c d))

(defn f2 [a b c]
  (fn [d]
    (+ a b c d)))

(defn f3 [a b]
  (fn [c]
    (fn [d]
      (+ a b c d))))

(defn f4 [a]
  (fn [b]
    (fn [c]
      (fn [d]
        (+ a b c d)))))

(f1 1 2 3 4)
((f2 1 2 3) 4)
(((f3 1 2) 3) 4)
((((f4 1) 2) 3) 4)