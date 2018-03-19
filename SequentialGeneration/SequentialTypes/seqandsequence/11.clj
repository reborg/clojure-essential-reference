(defn retrieve-specs [lines]
  (sequence
    (comp
      (map #(nthrest lines %))
      (keep #(take-while (some-fn header? metric?) %))
      (filter spec?)
      (map #(do (println "executing xducers") %))) ; <1>
    (range (count lines))))

(let [groups (retrieve-specs scanner-input)] ; <2>
  [(dorun (seq groups))
   (dorun (first groups))
   (dorun (last groups))])

;; executing xducers ; <3>
;; executing xducers
;; [nil nil nil]