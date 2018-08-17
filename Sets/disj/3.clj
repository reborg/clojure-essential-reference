(defn valid? [allowed values]
  (empty?
    (apply disj (set values) allowed))) ; <1>

(def allowed [:a :b :c])

(valid? allowed [:c :c 1 :a]) ; <2>
;; false

(valid? allowed [:c :c :a]) ; <3>
;; true