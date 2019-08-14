(defn make-type [obj t] ; <1>
  (vary-meta obj assoc :type t))

(def person (make-type {:name "John" :title "Mr"} :person)) ; <2>
(def manning (make-type {:name "Manning" :owner "Marjan"} :business))

(defn print-contact [contact] ; <3>
  (condp = (type contact)
    :person (println (:title contact) (:name contact))
    :business (println (:name contact) (str "(" (:owner contact) ")"))
    String (println "Contact:" contact)
    (println "Unknown format.")))

(print-contact person) ; <4>
;; Mr John

(print-contact manning)
;; Manning (Marjan)

(print-contact "Mr. Renzo") ; <5>
;; Contact: Mr. Renzo

(print-contact nil)
;; Unknown format.