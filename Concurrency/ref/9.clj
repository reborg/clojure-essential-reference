(def votes ; <1>
  {"honeypot" (ref 0)
   "candidate-0" (ref 0)
   "candidate-1" (ref 0)
   "candidate-2" (ref 0)
   "candidate-3" (ref 0)
   "candidate-4" (ref 0)})

(defn batch [prefs]
  (future
    (dosync
      (ensure (votes "honeypot")) ; <2>
      (doseq [color prefs
              :while (< @(votes "honeypot") 5)]
        (update votes color commute inc)))))

(defn generate-poll [honeypot & preference] ; <3>
  (concat
    (repeat honeypot "honeypot")
    (eduction
      (map-indexed #(repeat %2 (str "candidate-" %1)))
      cat
      preference)))

(let [c1 (batch (generate-poll 3 10 30 20 30 20)) ; <4>
      c2 (batch (generate-poll 5 20 10 10 30 20))]
  [@c1 @c2]
  {:total-votes (reduce + (map deref (vals votes)))
   :winner (ffirst (sort-by (comp deref second) > votes))
   :fraud? (= @(votes "honeypot") 5)})

;; {:total-votes 115, :winner "candidate-1", :fraud? true}