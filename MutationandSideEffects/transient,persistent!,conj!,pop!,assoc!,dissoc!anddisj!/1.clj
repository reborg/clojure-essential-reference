(def v (transient []))

(conj v 1)
;; ClassCastException
;; clojure.lang.PersistentVector$TransientVector
;; cannot be cast to clojure.lang.IPersistentCollection