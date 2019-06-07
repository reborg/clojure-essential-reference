(defn evaluate [node] ; <1>
  (if-let [f (:function node)]
    (apply f (:children node))
    node))

(postwalk evaluate (compound-interest-data 7.2 5000 2)) ; <2>
;; 5771.936460924754