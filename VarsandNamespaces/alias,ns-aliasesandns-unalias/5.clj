(ns-aliases 'anotherns) ; <1>
;; {s #object[clojure.lang.Namespace 0x5d1fa08b "clojure.set"]}
(ns-unalias 'anotherns 's) ; <2>
(ns-aliases 'anotherns) ; <3>
;; {}