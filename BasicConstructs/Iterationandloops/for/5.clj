(take 6
  (for [i (range)
        j (range)
        :while (< j 3)]
    (str i j)))
;; ("00" "01" "02" "10" "11" "12")