(defmacro aif [expr then & [else]]
  `(let [~'it ~expr]
    (if ~'it
      ~then
      ~else)))

(aif true (println "it is" it) (println "no 'it' here"))
(aif false (println it) (println "no 'it' here"))