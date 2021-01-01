(pprint (:ancestors (r/reflect {} :ancestors true))) ; <1>

;; #{java.lang.Object clojure.lang.Associative
;;   java.util.concurrent.Callable java.util.Map clojure.lang.ILookup
;;   java.lang.Runnable clojure.lang.IPersistentCollection
;;   clojure.lang.IHashEq clojure.lang.IObj clojure.lang.IFn
;;   clojure.lang.MapEquivalence clojure.lang.IKVReduce clojure.lang.IMeta
;;   clojure.lang.Counted clojure.lang.IPersistentMap clojure.lang.Seqable
;;   java.io.Serializable clojure.lang.AFn
;;   clojure.lang.IEditableCollection clojure.lang.IMapIterable
;;   clojure.lang.APersistentMap java.lang.Iterable}

(count (:members (r/reflect {}))) ; <2>
;; 37

(count (:members (r/reflect {} :ancestors true)))
;; 180