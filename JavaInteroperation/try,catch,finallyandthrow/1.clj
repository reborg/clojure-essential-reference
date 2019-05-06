(throw (Throwable. ": there was a problem.")) ; <1>
;; Throwable : there was a problem. ; <2>

(clojure.repl/pst) ; <3>
;; Throwable : there was a problem.
;;         user/eval1927 (form-init5670973898278733609.clj:1)
;;         user/eval1927 (form-init5670973898278733609.clj:1)
;;         clojure.lang.Compiler.eval (Compiler.java:6927)
;;         [....]