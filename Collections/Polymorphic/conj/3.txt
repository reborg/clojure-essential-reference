(conj nil 1 2 3)                ; <1>
;; (3 2 1)

(conj {:a 1 :b 2} {:c 3 :d 4})  ; <2>
;; {:a 1, :b 2, :c 3, :d 4}

(defrecord Person [name age])
(defrecord Address [number street zip])
(defrecord Phone [mobile work])

(conj                           ; <3>
  (Person. "Jake" "38")
  (Address. 18 "High Street" 60160)
  (Phone. "801-506-213" "299-12-213-22"))

;; #user.Person{:name "Jake", :age "38", :number 18,
                :street "High Street",
                :zip 60160, :mobile "801-506-213",
                :work "299-12-213-22"}

(def q (conj (clojure.lang.PersistentQueue/EMPTY) 1 2 3)) ; <4>
(peek q)
;; 1