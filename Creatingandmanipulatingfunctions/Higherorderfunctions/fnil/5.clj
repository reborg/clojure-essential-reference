(defn fnil+ [f & opts]
  (fn [& args]
    (apply f (map #(if (nil? %1) %2 %1) args (concat opts (repeat nil))))))