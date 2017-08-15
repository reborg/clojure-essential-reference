(filter+ re-seq                               ; <1>
  (map re-pattern (map str (range)))          ; <2>
  ["234983" "5671" "84987"])
;; ((#"1" "5671"))                            ; <3>