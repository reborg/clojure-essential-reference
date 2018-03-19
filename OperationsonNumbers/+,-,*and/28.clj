(defn x-power-of-y [x y] (reduce * (repeat y x))) ; <1>
(def square #(x-power-of-y % 2)) ; <2>
(def cube #(x-power-of-y % 3))

(defn reciprocal-of [f] ; <3>
  (->> (range)
    (map f)
    rest
    (map /)))

(defn riemann-zeta [f n] ; <4>
  (->> f
    reciprocal-of
    (take n)
    (reduce +)
    float))

(riemann-zeta square 1000) ; <5>
;; 1.6439346

(/ (* Math/PI Math/PI) 6) ; <6>
;; 1.6449340668482264

(riemann-zeta cube 100) ; <7>
;; 1.2020074