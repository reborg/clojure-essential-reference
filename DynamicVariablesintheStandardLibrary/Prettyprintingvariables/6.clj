(require '[clojure.pprint :as pprint])

(pprint/pprint (keys (methods pprint/simple-dispatch))) ; <1>
;; (nil ;
;;  clojure.lang.PersistentQueue
;;  clojure.lang.ISeq
;;  :default
;;  clojure.lang.IPersistentVector
;;  clojure.lang.IPersistentMap
;;  clojure.lang.IDeref
;;  clojure.lang.IPersistentSet
;;  clojure.lang.Var)