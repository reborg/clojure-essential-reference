(spit source-file
  "(ns assertion) ; <1>
   (defn select [n]
     (assert false \"Never triggers\"))")

(binding [*assert* false] ; <2>
  (compile 'assertion))
;; assertion

(assertion/select -5) ; <3>
;; nil