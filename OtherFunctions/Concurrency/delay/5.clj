(def coll [(delay (println :evaluated) :item0) :item1 :item2]) ; <1>
(map force coll) ; <2>
;; :evaluated
;; (:item0 :item1 :item2)