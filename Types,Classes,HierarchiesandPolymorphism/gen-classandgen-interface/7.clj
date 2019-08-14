(ns bookgenclass
  (:gen-class :name book.GenClass)) ; <1>

(defn -main [& args]
  (println \"Hello from Java?\"))