(fn [x] (.toString x)) ; <1>
;; #object[user$eval1935$fn__1936 0x146c987a "user$eval1935$fn__1936@146c987a"]

(set! *warn-on-reflection* true) ; <2>

(fn [x] (.toString x)) ; <3>
;; Reflection warning - reference to field toString can't be resolved