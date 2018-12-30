(require '[clojure.string :as s]) ; <1>

(s/blank? " \t \n \f \r ") ; <2>
;; true

(s/blank? "\u000B \u001C \u001D \u001E \u001F") ; <3>
;; true