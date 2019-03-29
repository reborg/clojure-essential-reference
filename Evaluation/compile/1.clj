(spit "src/source.clj" ; <1>
  "(ns source)
   (defn plus [x y] (+ x y))")

(binding [clojure.core/*compile-path* "target/classes"] ; <2>
  (compile 'source))
;; nil