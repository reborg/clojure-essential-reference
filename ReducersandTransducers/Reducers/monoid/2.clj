(require '[clojure.core.reducers :as r])      ; <1>

(r/fold
  (r/monoid str (constantly "Concatenate "))  ; <2>
  ["th" "is " "str" "ing"])
;; "Concatenate this string"