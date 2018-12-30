(filter
  #(re-find #"-seq" (str (key %))) ; <1>
  (ns-publics 'clojure.core))      ; <2>

;; ([tree-seq #'clojure.core/tree-seq] ; <3>
;;  [line-seq #'clojure.core/line-seq]
;;  [iterator-seq #'clojure.core/iterator-seq]
;;  [enumeration-seq #'clojure.core/enumeration-seq]
;;  [resultset-seq #'clojure.core/resultset-seq]
;;  [re-seq #'clojure.core/re-seq]
;;  [lazy-seq #'clojure.core/lazy-seq]
;;  [file-seq #'clojure.core/file-seq]
;;  [chunked-seq? #'clojure.core/chunked-seq?]
;;  [xml-seq #'clojure.core/xml-seq])