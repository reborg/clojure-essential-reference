(require '[clojure.repl :refer [dir-fn]]) ; <1>

(apply str (interpose "," (dir-fn 'clojure.walk))); <2>

;; "keywordize-keys,macroexpand-all,postwalk,postwalk-demo,
;; postwalk-replace,prewalk,prewalk-demo,prewalk-replace,stringify-keys,walk"