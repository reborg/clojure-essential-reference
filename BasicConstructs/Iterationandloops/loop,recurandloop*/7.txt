(set! *warn-on-reflection* true)

(defn lazy-root [^double x] ; <1>
  (->> 1.                   ; <2>
       (iterate #(/ (+ (/ x %) %) 2)) ; <3>
       (filter #(< (Math/abs (- (* % %) x)) 1e-8)) ; <4>
       first))

(defn sq-root [x] ; <5>
  (cond
    (or (zero? x) (= 1 x)) x
    (neg? x) (Double/NaN)
    :else (lazy-root x)))

(sq-root 2)
;; 1.4142135623746899