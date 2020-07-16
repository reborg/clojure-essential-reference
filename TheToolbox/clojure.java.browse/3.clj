(require '[clojure.java.browse :refer [browse-url *open-url-script*]])

(binding [*open-url-script* (atom "wget")]  ; <1>
  (browse-url "http://www.gutenberg.org/files/2600/2600-0.txt"))
;; true