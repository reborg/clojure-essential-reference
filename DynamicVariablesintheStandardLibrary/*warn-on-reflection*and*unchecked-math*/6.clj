(set! *unchecked-math* :warn-on-boxed) ; <1>

(defn sum [^long a b] ; <2>
  (+ a b))

;; Boxed math warning, - call: ; <3>
;; public static Number clojure.lang.Numbers.unchecked_add(long,Object)