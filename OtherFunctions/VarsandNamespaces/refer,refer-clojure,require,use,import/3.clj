(contains? (set (map ns-name (all-ns))) 'clojure.set) ; <1>
;; false

(require 'clojure.set)

(contains? (set (map ns-name (all-ns))) 'clojure.set) ; <2>
;; true