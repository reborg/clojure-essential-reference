(def sample-person
  {:person_id         1234567
   :person_name       "John Doe"
   :image             {:url "http://focus.on/me.jpg"
                       :preview "http://corporate.com/me.png"}
   :person_short_name "John"})

(def cleanup                                      ; <1>
  {:person_id     [:id str]
   :person_name   [:name (memfn toLowerCase)]
   :image         [:avatar :url]})

(defn transform [orig mapping]
  (apply merge
    (map (fn [[k [k' f]]] {k' (f (k orig))})      ; <2>
      mapping)))

(transform sample-person cleanup)