(require '[criterium.core :refer [bench]])

(let [myvec (partial vector :start)] (bench (myvec 1 2 3))) ; <1>
;; Execution time mean : 9.466062 ns
(let [myvec (partial vector :start)] (bench (myvec 1 2 3 4))) ; <2>
;; Execution time mean : 214.156293 ns
(let [myvec (fn [a b c d] (vector :start a b c d))] (bench (myvec 1 2 3 4))) ; <3>
;; Execution time mean : 8.156293 ns