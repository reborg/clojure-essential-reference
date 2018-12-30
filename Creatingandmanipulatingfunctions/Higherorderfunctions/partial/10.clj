(require '[criterium.core :refer [bench]])

(let [myvec (partial vector :start)] (bench (myvec 1 2 3))) ; <1>
;; Execution time mean : 28.466062 ns
(let [myvec (partial vector :start)] (bench (myvec 1 2 3 4))) ; <2>
;; Execution time mean : 604.156293 ns