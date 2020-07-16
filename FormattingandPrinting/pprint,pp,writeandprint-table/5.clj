(pretty/with-pprint-dispatch
  pretty/code-dispatch ; <1>
  (pprint (read-string op-fn)))

;; (defn op [sel]
;;   (condp = sel
;;     "plus" +
;;     "minus" -
;;     "mult" *
;;     "div" /
;;     "rem" rem
;;     "quot" quot))