(require '[clojure.reflect :as r]) ; <1>
(keys (r/reflect clojure.lang.APersistentMap)) ; <2>
;; (:bases :flags :members) ; <3>