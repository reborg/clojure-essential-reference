(let [x [\a 1 2 3 nil 5]]
  (cond->> x
    (char? (first x))   rest
    true                (remove nil?)
    (> (count x) 5)     (reduce +)))