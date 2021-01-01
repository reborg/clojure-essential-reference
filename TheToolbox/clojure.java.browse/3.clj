(require '[clojure.java.browse :refer [browse-url *open-url-script*]])

(binding [*open-url-script* (atom "wget")]  ; <1>
  (browse-url "https://tinyurl.com/wandpeace"))
;; true