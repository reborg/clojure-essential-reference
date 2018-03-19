(require '[clojure.xml :refer [parse]])
(require '[criterium.core :refer [quick-bench]])

(def document
  (parse "https://static.nvd.nist.gov/feeds/xml/cve/misc/nvd-rss.xml"))

(let [branch? (complement string?) ; <1>
      children (comp seq :content)]
  (quick-bench (dorun (tree-seq branch? children document))))

;; Execution time mean : 2304.531 µs

(let [branch? (complement string?) ; <2>
      children (comp seq :content)]
  (quick-bench (doall (tree branch? children document))))

;; Execution time mean : 437.484386 µs