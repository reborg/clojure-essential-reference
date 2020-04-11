(def votes (ref {})) ; <1>

(defn counter [poll votes] ; <2>
  (future
    (dosync
      (doseq [pref poll]
        (commute votes update pref (fnil inc 0))))))

(defn generate-poll [& preference] ; <3>
  (eduction
    (map-indexed #(repeat %2 (str "candidate-" %1)))
    cat
    preference))

(let [c1 (counter (generate-poll 40 64 19 82 11) votes) ; <4>
      c2 (counter (generate-poll 10 89 23 75 22) votes)]
  [@c1 @c2]
  @votes)

;; {"candidate-0" 50 ; <5>
;;  "candidate-1" 153
;;  "candidate-2" 42
;;  "candidate-3" 157
;;  "candidate-4" 33}