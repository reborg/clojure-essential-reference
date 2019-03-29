(declare state-one) ; <1>

(def state-zero ; <2>
  #(if (= \0 (first %))
      (state-one (next %))
      (if (nil? %) true false)))

(def state-one  ; <3>
  #(if (= \1 (first %))
      (state-zero (next %))
      (if (nil? %) true false)))

(state-zero "0100100001") ; <4>
;; false
(state-zero "0101010101") ; <5>
;; true