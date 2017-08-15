(defn pluralize [s]
  (if (not (clojure.string/blank? s))
    (str s "s")
    s))

(pluralize "flower")
;; flowers

(pluralize "")
;; ""

(pluralize "     ")
;; "     "