(def grocery ["apple" "banana" "mango" "other fruits"])

(apply str (interpose ", " grocery)) ; <1>
;; "apple, banana, mango, other fruits"

(transduce (interpose ", ") str grocery) ; <2>
;; "apple, banana, mango, other fruits"