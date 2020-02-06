(def sb (doto (StringBuilder.)
              (.append "23")
              (.append "aa 42")))
(re-seq #"\d+" sb) ; <1>
;; ("23" "42")