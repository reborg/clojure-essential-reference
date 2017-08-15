(let [x [\a 1 2 3 nil 5]]             ; <1>
  (cond->> x                          ; <2>
    (char? (first x)) rest            ; <3>
    true (remove nil?)                ; <4>
    (> (count x) 5) (reduce +)))      ; <5>

;; -> 11