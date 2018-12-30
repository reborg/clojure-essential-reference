(def s "A drink here and a drink home.")

(s/replace s #"drink|soda|water" "beer") ; <1>
;; "A beer here and a beer home."

(s/replace-first s #"drink|soda|water" "beer") ; <2>
;; "A beer here and a drink home."