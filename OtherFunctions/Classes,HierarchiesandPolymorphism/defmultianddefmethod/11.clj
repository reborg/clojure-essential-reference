(defmulti throwing identity)
(defmethod throwing :default throwing-impl [x] ; <1>
  (throw (RuntimeException. (str "Problems with" x))))

(throwing (symbol " this fn")) ; <2>
;; RuntimeException Problems with this fn  user/eval2056/throwing-impl--2057