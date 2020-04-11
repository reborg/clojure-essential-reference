(var a) ; <1>
;; CompilerException java.lang.RuntimeException: Unable to resolve var: a [...]

(def a 1)
(var a) ; <2>
;; #'user/a

(var test-var/a) ; <3>
;; CompilerException java.lang.RuntimeException: Unable to resolve var: test-var/a [...]

(create-ns 'test-var)
(intern 'test-var 'a 1)
(var test-var/a) ; <4>
;; #'test-var/a

(= (var a) (var test-var/a))
;; false