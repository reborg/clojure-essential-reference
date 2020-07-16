(require '[clojure.pprint :as pretty])

(doc pretty/write) ; <1>
;; -------------------------
;; clojure.pprint/write
;; ([object & kw-args])
;; Write an object subject to the current bindings of the printer control variables.
;; Use the kw-args argument to override individual variables for this call (and any
;; recursive calls). Returns the string result if :stream is nil or nil otherwise.
;;
;; The following keyword arguments can be passed with values:
;;   Keyword              Meaning                              Default value
;;   :stream              Writer for output or nil             *out*
;;   :base                Base to use for writing rationals    *print-base*
;;   :length              Maximum elements to show in sublists *print-length*
;;   :level               Maximum depth                        *print-level*
;;   :miser-width         Width to enter miser mode            *print-miser-width* ; <2>
;;   :dispatch            The pretty print dispatch function   *print-pprint-dispatch*
;;   :pretty              If true, do pretty printing          *print-pretty*
;;   :radix               If true, prepend a radix specifier   *print-radix*
;;   :right-margin        The column for the right margin      *print-right-margin*
;;   :suppress-namespaces If true, no namespaces in symbols    *print-suppress-namespaces*