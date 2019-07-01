(require '[clojure.java.javadoc :as browse]) ; <1>

(browse/javadoc "this is a string object") ; <2>
;; true

(browse/javadoc #("this fn class is not documented")) ; <3>