(let [s "local-var"
      f1 (^{:once true} fn* [] (str "local-var: " s))
      f2 (^{:once false} fn* [] (str "local-var: " s))]
  [(f1) (f1)
   (f2) (f2)])
;; ["local-var: local-var"
;;  "local-var: "            ; <1>
;;  "local-var: local-var"
;;  "local-var: local-var"]  ; <2>