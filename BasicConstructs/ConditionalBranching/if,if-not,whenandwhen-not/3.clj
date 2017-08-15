(defn toss []
  (if (> 0.5 (rand))                      ; <1>
    "head"
    "tail"))

(take 5 (repeatedly toss))                ; <2>
;; ("head" "head" "head" "head" "tail")