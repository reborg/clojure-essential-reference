(pprint (all-ns)) ; <1>
;; (#object[clojure.lang.Namespace 0x20312893 "clojure.edn"]
;;  #object[clojure.lang.Namespace 0x70eecdc2 "clojure.core.server"]

(ns-name (first (all-ns))) ; <2>
;; clojure.edn