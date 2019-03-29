(def s "May 2018, June 2019")

(s/replace s #"May|June" "10$") ; <1>
;; IllegalArgumentException

(s/replace s #"May|June" (s/re-quote-replacement "10$ in")) ; <2>
;; "1$ in 2018, 1$ in 2019"