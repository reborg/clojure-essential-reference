(require '[clojure.string :as str])

(defn grep-by-type [q ext] ; <1>
  (sequence
    (comp
       (remove (memfn isDirectory)) ; <2>
       (map (memfn getAbsolutePath)) ; <3>
       (filter #(= ext (last (str/split % #"\.")))) ; <4>
       (filter #(str/includes? (slurp %) q))) ; <5>
    (file-seq (java.io.File. "."))))

(grep-by-type "file-seq" "adoc")
;; ("/Users/reborg/book/./manuscript/08-Sequential-Generation.adoc")