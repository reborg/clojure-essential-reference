(def ^:dynamic *dvar*) ; <1>

((ns-map 'user) '*dvar*)
;; #'user/*dvar1*

(bound? #'*dvar*)
;; false

(thread-bound? #'*dvar*)
;; false

(binding [*dvar* 1] ; <2>
  [(bound? #'*dvar*)
   (thread-bound? #'*dvar*)])
;; [true true]

(def avar) ; <3>

(bound? #'avar)
;; false

(thread-bound? #'avar)
;; false

(intern *ns* 'avar 1) ; <4>
(bound? #'avar)
;; true

(thread-bound? #'avar)
;; false