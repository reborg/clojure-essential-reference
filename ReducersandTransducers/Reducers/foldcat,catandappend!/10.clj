(require '[criterium.core :refer [quick-bench]])

(quick-bench (doall (r/foldcat (r-word text))))           ; <1>
;; Execution time mean : 166.526116 ms

(quick-bench (doall (r/fold concat conj (r-word text))))  ; <2>
;; Execution time mean : 659.501099 ms