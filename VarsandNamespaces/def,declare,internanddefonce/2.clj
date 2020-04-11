(ns myns)

(def ^{:created-at "date"} ; <1>
  def-meta-doc
  "A def with metadata and docstring." 1) ; <2>

(clojure.repl/doc def-meta-doc) ; <3>
;; -------------------------
;; myns/def-meta-doc
;;   A def with metadata and docstring.

(:created-at (meta (var def-meta-doc))) ; <4>
;; "date"