(defn custom-hierarchy [& derivations] ; <1>
  (reduce (fn [h [child parent]] (derive h child parent))
    (make-hierarchy)
    derivations))

(def h (custom-hierarchy ; <2>
  [:clerk :person]
  ['owner 'person]
  [String :person]))

(isa? h 'owner 'person) ; <3>
;; true
(isa? h :clerk :person)
;;true
(isa? h String :person)
;; true