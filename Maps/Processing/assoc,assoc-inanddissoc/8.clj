(def pairs [[:f 1] [:t 0] [:r 2] [:w 0]]) ; <1>

(map (fn [[item index :as v]] ; <2>
  (assoc v index item)) pairs)

;; ([:f :f] [:t 0] [:r 2 :r] [:w 0]) ; <3>