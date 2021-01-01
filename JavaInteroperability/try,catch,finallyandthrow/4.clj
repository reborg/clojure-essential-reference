(require '[clojure.java.io :as io])

(defmacro with-reader [r file & body] ; <1>
  `(let [~r (io/reader ~file)]
     (try
       ~@body ; <2>
     (finally ; <3>
       (.close ~r)))))

(with-reader r "/etc/hosts"
  (last (line-seq r)))
;; ::1