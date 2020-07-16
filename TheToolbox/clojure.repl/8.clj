(require '[clojure.repl :refer [source-fn]])
(source-fn 'not-empty) ; <1>
;; "(defn not-empty\n  \"If coll is empty, returns nil, else coll\"\n  ; <2>
;; {:added \"1.0\"\n   :static true}\n  [coll] (when (seq coll) coll))"

(println *1) ; <3>
;; (defn not-empty
;;   "If coll is empty, returns nil, else coll"
;;   {:added "1.0"
;;    :static true}
;;   [coll] (when (seq coll) coll))