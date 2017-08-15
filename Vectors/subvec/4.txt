(def subv (subvec (vector-of :int 1 2 3) 1)) ; <1>
(conj subv \a)
;; [2 3 97] ; <2>
(conj subv nil)
;; java.lang.NullPointerException ; <3>