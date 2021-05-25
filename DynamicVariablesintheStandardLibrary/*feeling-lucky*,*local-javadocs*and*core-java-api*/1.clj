(require '[clojure.java.javadoc :as jdoc])

(jdoc/javadoc []) ; <1>

(binding [jdoc/*feeling-lucky* false] ; <2>
  (jdoc/javadoc []))
;; Could not find Javadoc for clojure.lang.PersistentVector