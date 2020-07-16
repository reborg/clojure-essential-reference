(def s "I could have a drink here and wine home.")

(s/replace s #"a drink|beer|wine" "water") ; <1>
;; "I could have water here and water home."

(s/replace-first s #"a drink|beer|wine" "water") ; <2>
;; "I could have water here and wine home."