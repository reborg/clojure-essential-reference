(:ancestors (r/reflect clojure.lang.APersistentMap :ancestors true)) ; <1>

;; #{java.lang.Object clojure.lang.Associative
;;   java.util.concurrent.Callable java.util.Map clojure.lang.ILookup
;;   java.lang.Runnable clojure.lang.IPersistentCollection
;;   clojure.lang.IHashEq clojure.lang.IFn clojure.lang.MapEquivalence
;;   clojure.lang.Counted clojure.lang.IPersistentMap clojure.lang.Seqable
;;   java.io.Serializable clojure.lang.AFn java.lang.Iterable}

(count (:members (r/reflect clojure.lang.APersistentMap))) ; <2>
;; 28
(count (:members (r/reflect clojure.lang.APersistentMap :ancestors true)))
;; 137