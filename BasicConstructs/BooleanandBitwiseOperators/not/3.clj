(defn pluralize [s] ; <1>
  (if (not (clojure.string/blank? s))
    (str s "s")
    s))

(pluralize "flower")
;; flowers

(pluralize "")
;; ""

(pluralize "     ")
;; "     "