(require '[clojure.reflect :as r]) ; <1>

(keys (r/reflect {})) ; <2>
(keys (r/reflect clojure.lang.APersistentMap)) ; <3>

;; (:bases :flags :members) ; <4>