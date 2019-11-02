(defn fnil+ [f & defaults]
  (fn [& args] ; <1>
    (apply f
      (map (fn [value default] ; <2>
             (if (nil? value) default value))
        args
        (concat defaults (repeat nil))))))

(+ 1 2 nil 4 5 nil) ; <3>
;; NullPointerException

(def zero-defaulting-sum ; <4>
  (apply fnil+ + (repeat 0)))

(zero-defaulting-sum 1 2 nil 4 5 nil)
;; 12