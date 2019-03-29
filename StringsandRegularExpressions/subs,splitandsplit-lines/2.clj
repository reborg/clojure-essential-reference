(def errors ; <1>
  ["String index out of range: 34"
   "String index out of range: 48"
   "String index out of range: 3"])

(map #(subs % 27) errors) ; <2>
;; ("34" "48" "3")