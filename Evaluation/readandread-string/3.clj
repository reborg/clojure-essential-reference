(def example ; <1>
  "#?(:cljs :cljs :my :my :default <missing>)")

(read {:read-cond :allow} (reader-from example)) ; <2>
;; <missing>

(read {:read-cond :allow :features #{:my}} (reader-from example)) ; <3>
;; :my