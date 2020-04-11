(ns bookgenclass2
  (:gen-class :name book.GenClass2)) ; <1>

(defn -main [& args] ; <2>
  (println "More greetings from Java!"))