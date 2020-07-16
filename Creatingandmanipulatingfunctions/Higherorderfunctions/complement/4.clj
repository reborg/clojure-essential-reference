(filter (complement #{:a :b :c}) [:d 2 :a 4 5 :c]) ; <1>
;; (:d 2 4 5)

(filter (complement #{nil :a 2}) [:a 2 nil nil]) ; <2>
;; (nil nil)