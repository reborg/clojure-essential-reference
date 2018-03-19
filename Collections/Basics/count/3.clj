(require '[clojure.java.io :as io])

(defn- print-usage [] ; <1>
  (println "Usage: copy 'file-name' 'to-location' ['work-dir']"))

(defn- copy ; <2>
  ([in out]
    (copy in out "./"))
  ([in out dir]
    (io/copy (io/file (str dir in)) (io/file out))))

(defn -main [& args] ; <3>
  (cond
    (< (count args) 2) (print-usage)
    (= 2 (count args)) (copy (first args) (second args))
    (> (count args) 2) (copy (first args) (second args) (last args))))

(-main "project.clj" "/tmp/copy1.clj") ; <4>
;; nil

(-main "copy1.clj" "/tmp/copy2.clj" "/tmp/") ; <5>
;; nil