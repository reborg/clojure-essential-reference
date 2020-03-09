(require '[clojure.walk :refer [keywordize-keys stringify-keys]]) ; <1>

(keywordize-keys {"a" 1 "b" 2}) ; <2>
;; {:a 1 :b 2}

(stringify-keys {:a 1 :b 2}) ; <3>
;; {"a" 1 "b" 2}