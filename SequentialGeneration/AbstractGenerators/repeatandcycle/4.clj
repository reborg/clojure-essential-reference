(defn bang [sentence] ; <1>
  (map str (.split #"\s+" sentence) (repeat "!")))

(bang "Add exclamation each word")
;; ("Add!" "exclamation!" "each!" "word!")