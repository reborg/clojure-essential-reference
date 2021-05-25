(binding [pprint/*print-pprint-dispatch* pprint/code-dispatch] ; <1>
  (pprint (macroexpand-1 '(definline myfn []))))

;; (do
;;   (clojure.core/defn myfn [] nil)
;;   (clojure.core/alter-meta!
;;     #'myfn
;;     clojure.core/assoc
;;     :inline
;;     (clojure.core/fn myfn [] nil))
;;   #'myfn)

(binding [pprint/*print-pprint-dispatch* pprint/code-dispatch ; <2>
          pprint/*print-suppress-namespaces* true]
  (pprint (macroexpand-1 '(definline myfn []))))

;; (do
;;   (defn myfn [] nil)
;;   (alter-meta! #'myfn assoc :inline (fn myfn [] nil))
;;   #'myfn)