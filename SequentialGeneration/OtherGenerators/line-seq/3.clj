(import '[java.net URL])
(import '[java.util.zip ZipInputStream])
(require '[clojure.java.io :as io])

(def alexa "http://s3.amazonaws.com/alexa-static/top-1m.csv.zip")

(defn zip-reader [url] ; <1>
 (-> (URL. url)
     .openConnection
     .getInputStream
     ZipInputStream.
     (doto .getNextEntry)
     io/reader))

(defn domain [line] ; <2>
  (some-> line (.split "\\.") last))

(defn first-of-domain [ext] ; <3>
 (with-open [r (zip-reader alexa)]
  (some #(when (= ext (domain %)) %) (line-seq r))))

(first-of-domain "me")
;; "340,xx1.me"