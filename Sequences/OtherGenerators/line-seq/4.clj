(defn top-10-domains-by-traffic []
 (with-open [r (zip-reader alexa)]
  (->> (line-seq r)
       (map domain)
       frequencies        ; <1>
       (sort-by last >)
       (take 10)))

(top-10-domains-by-traffic alexa)
;; ["com" 487682] ["org" 50189] ["ru" 43619]
;; ["net" 42955] ["de" 36887] ["br" 20192]
;; ["uk" 18828] ["ir" 16915] ["pl" 16730] ["it" 11708]