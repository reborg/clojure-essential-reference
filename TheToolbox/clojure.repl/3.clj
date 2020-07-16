(in-ns 'user)
(find-doc "^to-") ; <1>

;; ------------------------- ; <2>
;; clojure.core/to-array
;; ([coll])
;;   Returns an array of Objects containing the contents of coll, which
;;   can be any Collection.  Maps to java.util.Collection.toArray().
;; -------------------------
;; clojure.core/to-array-2d
;; ([coll])
;;   Returns a (potentially-ragged) 2-dimensional array of Objects
;;   containing the contents of coll, which can be any Collection of any
;;   Collection.