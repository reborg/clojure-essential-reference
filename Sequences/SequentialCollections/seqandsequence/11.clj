(defn filter-pattern [lines]  ; <3>
  (sequence
    (comp
      (map (all-except-first lines))
      (keep if-header-or-metric)
      (filter pattern?)
      (map #(do (println "executing xducers") %))) ; <1>
    (range (count lines))))

(let [groups (filter-pattern device-output)] ; <2>
  [(dorun (seq groups))
   (dorun (first groups))
   (dorun (last groups))])

;; executing xducers ; <3>
;; executing xducers
;; [nil nil nil]