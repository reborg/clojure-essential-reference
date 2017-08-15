(def cashiers (atom [1 2 3 4 5]))

(defn next-available [cashiers]
  (some identity @cashiers))                              ; <1>

(defn make-available! [cashiers n]
  (swap! cashiers assoc (dec n) n))                       ; <2>

(defn make-unavailable! [cashiers n]
  (swap! cashiers assoc (dec n) false))                   ; <3>

(make-unavailable! cashiers (next-available cashiers))    ; <4>
;; [false 2 3 4 5]
(make-unavailable! cashiers (next-available cashiers))
;; [false false 3 4 5]