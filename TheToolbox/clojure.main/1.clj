(require '[clojure.main :as main]) ; <1>

clojure.core.reducers/fold ; <2>
;; CompilerException java.lang.ClassNotFoundException: clojure.core.reducers

(main/load-script "@clojure/core/reducers.clj") ; <3>

clojure.core.reducers/fold ; <4>
#object["clojure.core.reducers$fold@41414539"]