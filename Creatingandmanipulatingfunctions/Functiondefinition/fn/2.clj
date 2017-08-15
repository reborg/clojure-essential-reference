((fn [x] (* (Math/random) x))   ; <1>
  (System/currentTimeMillis))   ; <2>

;; 1.314465483718698E12

(#(* (Math/random) %)           ; <3>
  (System/currentTimeMillis))

;; 1.2215726280027874E12