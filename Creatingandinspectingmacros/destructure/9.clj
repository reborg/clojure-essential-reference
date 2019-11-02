(defn extract-info [{:keys [name surname] ; <1>
                     {:keys [street city]} :address ; <2>
                     [primary-contact secondary-contact] :contacts}] ; <3>
  (println name surname "lives at" street "in" city)
  (println "His primary contact is:" primary-contact)
  (when secondary-contact
    (println "His secondary contact is:" secondary-contact)))

(extract-info {:name "Foo" :surname "Bar"
               :address {:street "Road Fu 123" :city "Baz"}
               :contacts ["123-456-789", "987-654-321"]})

;; Foo Bar lives at: Road Fu 123 Baz
;; His primary contact is: 123-456-789
;; His secondary contact is: 987-654-321