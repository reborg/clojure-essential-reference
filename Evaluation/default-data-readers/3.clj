(import '[java.net URL] [java.io File])

(defmethod print-method URL [url writer] ; <1>
  (doto writer
    (.write "#url ")
    (.write "\"")
    (.write (.toString url))
    (.write "\"")))

(-> "/etc/hosts" File. .toURL pr-str) ; <2>
;; "#url \"file:/etc/hosts\""

(binding [*data-readers* {'url #(URL. %)}] ; <3>
  (-> "/etc/hosts" File. .toURL pr-str read-string))