(clojure.template/apply-template '[x] '(let [x x] x) [1]) ; <1>
; (let [1 1] 1)