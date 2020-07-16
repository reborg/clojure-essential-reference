(def primary-colors #{"red" "green" "blue"}); <1>

(def book (slurp "https://tinyurl.com/wandpeace")) ; <2>

(->> (s/split book #"\s+") ; <3>
     (filter primary-colors)
     frequencies)
;; {"red" 87, "blue" 64, "green" 38}

(->> (s/split book #"\s+") ; <4>
     (map s/lower-case)
     (filter primary-colors)
     frequencies)
;; {"red" 89, "blue" 64, "green" 38}