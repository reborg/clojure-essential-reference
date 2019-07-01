(require '[clojure.java.io :as io]) ; <1>

(with-open [r (io/reader "/usr/share/dict/words")] ; <2>
  (count (line-seq r))) ; <3>
;; 235886