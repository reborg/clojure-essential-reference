(let [a (fn [n] (* 2 n))]
  (let [a (fn [n] (+ 3 (a n)))]
    (a 2)))
;; 7