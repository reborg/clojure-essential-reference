(seq "hello") ; <1>
;; (\h \e \l \l \o)

(map (memfn toUpperCase) (map str "hello")) ; <2>
;; ("H" "E" "L" "L" "O")

(map (memfn toUpperCase) (re-seq #"\w" "hello")) ; <3>
;; ("H" "E" "L" "L" "O")