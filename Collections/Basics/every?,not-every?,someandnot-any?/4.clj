(def address-book
  [{:phone "664 223 8971" :name "Jack"}
   {:phone "222 231 9008" :name "Sarah"}
   {:phone "343 928 9911" :name "Oliver"}])

(->> address-book                           ; <1>
  (filter #(= "222 231 9008" (:phone %)))
  first)
;; {:phone "222 231 9008" :name "Sarah"}

(some #(when (= "222 231 9008" (:phone %)) %) address-book) ; <2>
;; {:phone "222 231 9008" :name "Sarah"}