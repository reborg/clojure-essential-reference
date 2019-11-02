(let [probe {:temp 150 :rpm "max"}]
  (when (and (> (:temp probe) 120) ; <1>
             (= (:rpm probe) "max"))
    (println "Too hot, going protection mode.")))

;; Too hot, going protection mode.