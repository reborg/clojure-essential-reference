(def sb (doto (java.lang.StringBuilder.)
              (.append "23")
              (.append "aa 42")))
(re-seq #"\d+" sb) ; <1>
;; ("23" "42")