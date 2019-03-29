(import 'java.lang.StringBuffer)

(s/index-of ; <1>
  (doto (StringBuffer.)
        (.append "Bonjure")
        (.append \space)
        (.append "Clojure"))
  \j)
;; 3