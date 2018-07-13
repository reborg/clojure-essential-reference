(defstruct
  (female (:include person)) ; <1>
     (gender "female" :type string))

(make-female :name "Debby")
;; #S(FEMALE :ID NIL :NAME "Debby" :AGE NIL :GENDER "female")