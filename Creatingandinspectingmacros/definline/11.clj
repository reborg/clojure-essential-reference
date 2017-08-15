(definline sq [x]                   ; <1>
  `(let [x# ~x] (int (* x# x#))))

(direct-use 2.0)
;; 4.0

(first (higher-order-use [2.0]))
;; 4