(require '[criterium.core :refer [bench]])
(set! *warn-on-reflection* true)                              ; <1>

(defn plain= [m n] (= m n))
(bench (let [m 1 n 2] (plain= m n)))
                                                              ;; Execution time mean : 6.963935 ns

(defn raw= [^Long m ^Long n] (.equals m n))
(bench (let [m 1 n 2] (raw= m n)))
                                                              ;; Execution time mean : 5.215350 ns           ; <2>