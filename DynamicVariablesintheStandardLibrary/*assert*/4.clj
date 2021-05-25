(spit source-file
  "(ns assertion)
   (defn select [n]
     (if (integer? n)   ; <1>
       (case (mod n 3)  ; <2>
         0 :ok
         1 :possible
         2 :reject
         (assert false \"Should never happen\"))
       :reject))")

(compile 'assertion) ; <3>
;; assertion

(assertion/select -5) ; <4>
;; :possible

(assertion/select 5.2)
;; :reject