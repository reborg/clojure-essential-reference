(require '[clojure.walk :as w])

(defn find-invoked-functions [expression]                         ; <1>
  (let [!fns (atom #{})                                           ; <2>
        walkfn! (fn walkfn! [expr]
                  (if (and (seq? expr) (symbol? (first expr)))    ; <3>
                    (let [head (first expr)]
                      (when-not (= 'quote head)                   ; <4>
                        (some->> head resolve (swap! !fns conj))
                        (w/walk walkfn! identity expr)))
                    (when (coll? expr)                            ; <5>
                      (w/walk walkfn! identity expr))))]
    (walkfn! (w/macroexpand-all expression))                      ; <6>
    @!fns))

(find-invoked-functions
  '(when-first [a (vector 1 2 3)]                               ; <7>
     (inc a)))

;;#{#'clojure.core/vector #'clojure.core/seq #'clojure.core/first #'clojure.core/inc}