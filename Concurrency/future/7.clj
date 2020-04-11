(let [s "yes"
      f1 (^:once fn* [] (str "local-var: " (or s "no")))
      f2 (^{:once false} fn* [] (str "local-var: " (or s "no")))]
  [(f1) (f1)
   (f2) (f2)])
;; ["local-var: yes"
;;  "local-var: no"    ; <1>
;;  "local-var: yes"
;;  "local-var: yes"]  ; <2>