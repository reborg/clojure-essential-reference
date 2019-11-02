(defn- quantifier? [[quant & args]] ; <1>
  (#{'EXIST 'ALL} quant))

(defn- emit-quantifier [op expr1 expr2] ; <2>
  (let [new-local (gensym "local")     ; <3>
        [quant local [pred _]] expr1]
    `(~quant ~new-local (~op ~expr2 (~pred ~new-local))))) ; <4>

(defn pull-quantifier [[op expr1 expr2 :as form]] ; <5>
  (cond (quantifier? expr1) (emit-quantifier op expr1 expr2)
        (quantifier? expr2) (emit-quantifier op expr2 expr1)
        :else form))

(pull-quantifier '(OR (EXIST x (Q x)) (P x)))
;; (EXIST local2747 (OR (P x) (Q local2747)))

(pull-quantifier '(OR (P x) (EXIST x (Q x))))
;; (EXIST local2750 (OR (P x) (Q local2750)))