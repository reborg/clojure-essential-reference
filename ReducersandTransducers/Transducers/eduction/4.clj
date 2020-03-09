(let [input (eduction (map #(do (print ".") %)) (range 10)) ; <1>
      odds (filter odd? input)
      evens (filter even? input)]
    (if (> (first odds) (first evens))
      (println "ok")
      (println "ko")))
;; ....................ok