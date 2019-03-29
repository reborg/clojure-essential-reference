(defn sound-speed-by-temp [temp] ; <1>
  {:op 'with-mapping
   :expr
   [{'inc [inc :onearg]
     'sqrt [(fn [x] (Math/sqrt x)) :onearg]}
    {:op 'times
     :expr
     [[:mph 738.189]
      {:op 'sqrt
       :expr
       [{:op 'inc
         :expr
         [{:op 'divide
           :expr [[:celsius temp]
                  [:zero 273.15]]}]}]}]}]})

(calculate (sound-speed-by-temp -60)) ; <2>
;; RuntimeException Don't know how to calculate {:op with-mapping [...]}