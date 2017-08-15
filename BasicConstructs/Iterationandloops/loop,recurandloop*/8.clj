(require '[criterium.core :refer [bench]])

(bench (lazy-root 2.))
;; Execution time mean : 590.703818 ns
;; [extended output omitted]

(bench (Math/sqrt 2.))
;; Execution time mean : 6.250582 ns
;; [extended output omitted]