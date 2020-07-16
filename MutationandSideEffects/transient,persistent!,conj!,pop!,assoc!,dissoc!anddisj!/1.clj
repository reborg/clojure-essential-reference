(class (transient [])) ; <1>
;; clojure.lang.PersistentVector$TransientVector

(conj (transient []) 1) ; <2>
;; ClassCastException
;; clojure.lang.PersistentVector$TransientVector
;; cannot be cast to clojure.lang.IPersistentCollection