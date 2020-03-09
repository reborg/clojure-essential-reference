(def prizes {"AB334XC" "2 Weeks in Mexico" ; <1>
             "QA187ZA" "Vespa Scooter"
             "EF133KX" "Gold jewelry set"
             "RE395GG" "65 inches Tv set"
             "DF784RW" "Bicycle"})

(defn win [tickets]                       ; <2>
  (or (some prizes tickets) "Sorry, try again"))

(win ["TA818GS" "RE395GG" "JJ148XN"])     ; <3>
;; "65 inches Tv set"
(win ["MP357SQ" "MB263DK" "HF359PB"])
;; "Sorry, try again"
(win ["MP357SQ" "MB263DK" "QA187ZA"])
;; "Vespa Scooter"