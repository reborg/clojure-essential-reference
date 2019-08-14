(when (and (> (:temp probe) 120)
           (= (:rpm probe) "max"))
  (println "Too hot, going protection mode."))