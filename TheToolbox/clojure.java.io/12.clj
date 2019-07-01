(require '[clojure.java.io :as io])

(defmethod @#'io/do-copy [String String] [in out opts] ; <1>
  (apply io/copy (io/file in) (io/file out) opts))

(io/copy "/tmp/words2" "/tmp/words3") ; <2>
;; nil

(.exists (io/file "/tmp/words3")) ; <3>
;; true