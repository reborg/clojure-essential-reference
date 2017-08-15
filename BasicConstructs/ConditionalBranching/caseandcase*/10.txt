(macroexpand
  '(case a 0 "0" 1 "1" :default))

;; (let*
;;   [G__759 a]
;;     (case* G__759
;;       0 0 :default
;;       {0 [0 "0"], 1 [1 "1"]}
;;       :compact :int))