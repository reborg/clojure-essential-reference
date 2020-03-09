(require '[clojure.walk :refer [keywordize-keys]])

(def products ; <1>
  [{"type" "Fixed"
    "bookings" [{"upto" 999 "flat" 249.0}]
    "enabled" false}
   {"type" "Variable"
    "bookings" [{"upto" 200 "flat" 20.0}]
    "enabled" true}])

(keywordize-keys products)

;; [{:type "Fixed" ; <2>
;;   :bookings [{:upto 999 :flat 249.0}]
;;   :enabled false}
;;  {:type "Variable"
;;   :bookings [{:upto 200 :flat 20.0}]
;;   :enabled true}]