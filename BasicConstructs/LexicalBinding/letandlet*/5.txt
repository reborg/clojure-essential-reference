(defn- generate-symbol [n]
  (symbol (str "a" n)))

(defn- generate [n]
  (->> (range n)
       (map (juxt generate-symbol identity))
       flatten
       vec))

(defmacro large-let [n]
  (let [bindings (generate n)]
    `(let ~bindings
       (reduce + [~@(map generate-symbol (range n))]))))

(macroexpand '(large-let 2))                                    ; <1>
;; (let* [a0 0 a1 1] (reduce + [a0 a1]))

(large-let 5000)                                                ; <2>
;; CompilerException java.lang.RuntimeException: Method code too large!