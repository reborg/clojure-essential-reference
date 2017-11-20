(defn distinct-words [words]
  (letfn [(walk [root res]   ; <1>
    (cond
      (instance? clojure.core.reducers.Cat root)
      (do (walk (.left root) res) (walk (.right root) res))
      (instance? java.util.HashSet root)
      (doto res (.addAll root))
      :else res))]
  (into #{} (walk words (HashSet.)))))  ; <2>

(count (distinct-words words)) ; <3>
;; 17200