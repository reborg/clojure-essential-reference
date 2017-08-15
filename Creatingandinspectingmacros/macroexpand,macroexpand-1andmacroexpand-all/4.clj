(defn find-invoked-functions [expression]                                             ; <1>
  (let [!fns (atom #{})                                                               ; <2>
        walk-fn! (fn walk-fn! [expr]
                   (if (and (seq? expr)                                               ; <3>
                            (symbol? (first expr)))

                     (let [head (first expr)]
                       (when-not (= 'quote head)                                      ; <4>
                         (do (some->> head resolve (swap! !fns conj))
                             (clojure.walk/walk walk-fn! identity expr))))

                     (when (coll? expr)                                               ; <5>
                       (clojure.walk/walk walk-fn! identity expr))))]

    (walk-fn! (clojure.walk/macroexpand-all expression))                              ; <6>

    @!fns))

(find-invoked-functions '(when-first [a (vector 1 2 3)]                               ; <7>
                           (inc a)))
;;#{#'clojure.core/vector #'clojure.core/seq #'clojure.core/first #'clojure.core/inc}