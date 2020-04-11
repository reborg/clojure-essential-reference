(def libs (loaded-libs))

(pprint libs) ; <1>
;; #{clojure.core.protocols clojure.core.server clojure.edn
;;   clojure.instant clojure.java.browse clojure.java.io
;;   clojure.java.javadoc clojure.java.shell clojure.main clojure.pprint
;;   clojure.repl clojure.string clojure.uuid clojure.walk}

(require '[clojure.data :refer [diff]])
(def nss (set (map ns-name (all-ns))))
(pprint (diff libs nss)) ; <2>
;; [nil   ; <3>
;;  #{user clojure.core clojure.set clojure.data} ; <4>
;;  #{clojure.core.protocols clojure.core.server clojure.edn ; <5>
;;    clojure.instant clojure.java.browse clojure.java.io
;;    clojure.java.javadoc clojure.java.shell clojure.main clojure.pprint
;;    clojure.repl clojure.string clojure.uuid clojure.walk}]