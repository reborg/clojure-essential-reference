(defmethod calculate :default
  [{op :op [ops forms] :expr :as form}]
  (if (= 'with-mapping op)
    (do
      (alter-var-root #'hierarchy add-ops ops) ; <1>
      (alter-var-root #'ops into ops) ; <2>
      (calculate forms)) ; <3>
    (throw (RuntimeException. (str "Don't know how to calculate " form)))))

(- (calculate (sound-speed-by-temp -60))   ; <4>
   (calculate (sound-speed-by-temp  20)))
;; -112.64352508635466