(create-ns 'disappear) ; <1>
(intern 'disappear 'my-var 0)
(refer 'disappear :only ['my-var])

my-var
;; 0

(remove-ns 'disappear) ; <2>
(.ns #'my-var)
;; #object[clojure.lang.Namespace 0x1f780201 "disappear"]

(create-ns 'disappear) ; <3>
(intern 'disappear 'my-var 1)

my-var ; <4>
;; 0

@#'disappear/my-var ; <5>
;; 1