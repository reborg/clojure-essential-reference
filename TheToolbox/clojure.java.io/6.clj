(require '[clojure.java.io :refer [resource reader]])

(def cjio (resource "clojure/java/io.clj")) ; <1>

(first (line-seq (reader cjio))) ; <2>
;; ";   Copyright (c) Rich Hickey. All rights reserved."