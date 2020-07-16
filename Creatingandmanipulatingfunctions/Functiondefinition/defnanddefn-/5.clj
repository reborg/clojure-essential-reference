(defn ^{:t1 1} foo  ; <1>
  "docstring"
  {:t2 2} (^{:t3 3} [a b] {:t4 4} (+ a b)) ; <2>
  {:t5 5}) ; <3>

(meta #'foo) ; <4>

;; {:ns #object[clojure.lang.Namespace 0x33f17f86 "user"],
;;  :name foo,
;;  :t2 2,
;;  :file
;;  "/private/var/form-init5372276344059831979.clj",
;;  :column 1,
;;  :line 1,
;;  :arglists ([a b]),
;;  :doc "docstring",
;;  :t1 1,
;;  :t5 5}

(meta (first (:arglists (meta #'foo)))) ; <5>
;; {:t3 3, :t4 4}