[~@[1 2]]
;; java.lang.IllegalStateException: Attempting to call unbound fn: #'clojure.core/unquote-splicing

`[~@:foo]
;; IllegalArgumentException Don't know how to create ISeq from: clojure.lang.Keyword

`~@[1]
;; IllegalStateException splice not in list  clojure.lang.LispReader$SyntaxQuoteReader.syntaxQuote