(first
  (sequence
    (comp (map #(do (print % ",") %))   ; <1>
          (partition-all 100))          ; <2>
    (range)))
;;0, 1, 2, ....., 3299,                 ; <3>
;;[0 1 2 ... 98 99]                     ; <4>