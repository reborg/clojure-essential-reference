(defn var-args [a b & all]
  (apply vector a b all)) ; <1>

(var-args :a :b :c)
;; [:a :b :c]