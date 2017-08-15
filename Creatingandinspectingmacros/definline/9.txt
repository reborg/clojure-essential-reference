(definline sq [x]                             ; <1>
  `(let [x# ~x] (* x# x#)))

(defn direct-use [x]                          ; <2>
  (sq x))

(defn higher-order-use [xs]                   ; <3>
  (map sq xs))

(direct-use 2.0)
;; 4.0

(first (higher-order-use [2.0]))
;; 4.0