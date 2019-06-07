(require '[clojure.walk :as walk]) ; <1>

(defn inner [x] (println "inner on" x) x)
(defn outer [x] (println "outer on" x) x)

(walk/walk inner outer [1 [2] #{:a 1} 4]) ; <2>
;; inner on 1
;; inner on [2]
;; inner on #{1 :a}
;; inner on 4
;; outer on [1 [2] #{1 :a} 4]
;; [1 [2] #{1 :a} 4]