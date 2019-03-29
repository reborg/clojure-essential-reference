(def definitions ; <1>
  {'ns1 [['a1 1] ['b1 2]]
   'ns2 [['a2 2] ['b2 2]]})

(defn defns [definitions] ; <2>
  (for [[ns defs] definitions
        [name body] defs]
    (do
      (create-ns ns)
      (intern ns name body))))

(defns definitions) ; <3>
;; (#'ns1/a1 #'ns1/b1 #'ns2/a2 #'ns2/b2)