(def dict (slurp "/usr/share/dict/words"))  ; <1>

(->> dict
  (re-seq #"\S+")   ; <2>
  (group-by sort)   ; <3>
  (sort-by (comp count second) >) ; <4>
  (map second)      ; <5>
  first)

;; ["caret" "carte" "cater" "crate" "creat" "creta" "react" "recta" "trace"]