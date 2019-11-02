(defn ^{:t1 1} foo  ; <1>
  "docstring"
  {:t2 2} ([a b] (+ a b)) ; <2>
  {:t3 3}) ; <3>

(meta #'foo) ; <4>

;; {:ns #object[clojure.lang.Namespace 0x6f952d6c "user"],
    :name foo,
    :t2 2,
    :file "NO_SOURCE_PATH",
    :column 1,
    :line 97,
    :t3 3,
    :arglists ([a b]),
    :doc "docstring",
    :t1 1}