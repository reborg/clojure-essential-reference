(definterface IPerson ; <1>
  (getName [])
  (setName [s])
  (getAge [])
  (setAge [n]))

(deftype Person [^:unsynchronized-mutable name ; <2>
                 ^:unsynchronized-mutable age]
  IPerson
  (getName [this] name)
  (setName [this s] (set! name s)) ; <3>
  (getAge [this] age)
  (setAge [this n] (set! age n)))

(def p (->Person "Natasha" "823")) ; <4>
(.setAge p 23)
;; 23