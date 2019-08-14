(defmulti edges ; <1>
  "Retrieves first and last from a collection" type)

(defmethod edges java.lang.Iterable [x] ; <2>
  ((juxt first last) (seq x)))

(defmethod edges clojure.lang.IPersistentList [x] ; <3>
  ((juxt first last) (seq x)))

(edges (list 1 2 3)) ; <4>
;; IllegalArgumentException Multiple methods in multimethod 'edges'

(prefer-method edges clojure.lang.IPersistentList java.lang.Iterable)
(edges (list 1 2 3)) ; <5>
;; [1 3]