(let [x \c]             ; <1>
  (cond-> x             ; <2>
    (char? x) int       ; <3>
    (char? x) inc       ; <4>
    (string? x) reverse ; <5>
    (= \c x) (/ 2)))    ; <6>

;; 50