(set! *warn-on-reflection* true)
(def a (int-array (range 10)))

(alength a) ; <1>
;; Reflection warning, call to static method alength on clojure.lang.RT can't be resolved.
;; 10