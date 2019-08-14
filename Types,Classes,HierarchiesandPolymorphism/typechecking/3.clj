(defmulti print-contact type) ; <1>

(defmethod print-contact :person ; <2>
  [contact]
  (println (:title contact) (:name contact)))

(defmethod print-contact :business
  [contact]
  (println (:name contact) (str "(" (:owner contact) ")")))

(defmethod print-contact String
  [contact]
  (println "Contact:" contact))

(defmethod print-contact :default
  [contact]
  (println "Unknown format."))

(print-contact person) ; <3>
;; Mr John

(print-contact manning)
;; Manning (Marjan)

(print-contact "Mr. Renzo")
;; Contact: Mr. Renzo

(print-contact nil)
;; Unknown format.