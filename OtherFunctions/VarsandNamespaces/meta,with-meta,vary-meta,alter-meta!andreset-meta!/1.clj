(pprint (meta #'+)) ; <1>

;; {:added "1.2",
;;  :ns #object[clojure.lang.Namespace 0x1edb61b1 "clojure.core"],
;;  :name +,
;;  :file "clojure/core.clj",
;;  :inline-arities
;;  #object[clojure.core$_GT_1_QMARK_ 0x7b22ec89 "GT_1_QMARK"],
;;  :column 1,
;;  :line 965,
;;  :arglists ([] [x] [x y] [x y & more]),
;;  :doc
;;  "Returns the sum of nums."
;;  :inline
;;  #object[clojure.core$nary_inline 0x790132f7 "clojure.core$nary_inline"]}

(meta 1) ; <2>
;; nil