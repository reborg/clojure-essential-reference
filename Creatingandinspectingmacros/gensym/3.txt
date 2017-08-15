
(defn ^:private gen-cond-thread                                          ; <1>
  [expr clauses thread]
  (let [g (gensym)                                                       ; <2>
        [steps ret] (->> clauses
                         (partition 2)                                   ; <3>
                         (map (fn [[test step]]
                                `(if (~test ~g) (~thread ~g ~step) ~g))) ; <4>
                         ((juxt butlast last)))]                         ; <5>
    `(let [~g ~expr
           ~@(interleave (repeat g) steps)]                              ; <6>
       ~(or ret g))))                                                    ; <7>

(defmacro condp->                                                        ; <8>
  [expr & clauses]
  (gen-cond-thread expr clauses `->))

(defmacro condp->>
  [expr & clauses]
  (gen-cond-thread expr clauses `->>))