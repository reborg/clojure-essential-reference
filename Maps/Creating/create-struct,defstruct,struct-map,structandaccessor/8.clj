;; Lisp code

(defstruct ; <1>
  (person (:constructor create-person (id name age)))
     id name age)

(create-person 1 "reborg" 40) ; <2>
;; #S(PERSON :ID 1 :NAME "reborg" :AGE 40)