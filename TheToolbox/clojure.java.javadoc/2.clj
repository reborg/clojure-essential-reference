(require '[clojure.java.javadoc :as browse])

(defn java-version [] ; <1>
  (let [jsv (System/getProperty "java.specification.version")]
    (if-let [single-digit (last (re-find #"^\d\.(\d+).*" jsv))]
      single-digit jsv)))

(def jdocs-template ; <2>
  (format "https://docs.oracle.com/javase/%s/docs/api/" (java-version)))

(def known-prefix ; <3>
  ["java." "javax." "org.ietf.jgss." "org.omg."
   "org.w3c.dom." "org.xml.sax."])

(doseq [prefix known-prefix] ; <4>
  (browse/add-remote-javadoc prefix jdocs-template))

(clojure.pprint/pprint @browse/*remote-javadocs*) ; <5>
;; {"java." "https://docs.oracle.com/javase/8/docs/api/",
;;  "javax." "https://docs.oracle.com/javase/8/docs/api/",
;;  "org.apache.commons.codec."
;;  "http://commons.apache.org/codec/api-release/",
;;  "org.apache.commons.io."
;;  "http://commons.apache.org/io/api-release/",
;;  "org.apache.commons.lang."
;;  "http://commons.apache.org/lang/api-release/",
;;  "org.ietf.jgss." "https://docs.oracle.com/javase/8/docs/api/",
;;  "org.omg." "https://docs.oracle.com/javase/8/docs/api/",
;;  "org.w3c.dom." "https://docs.oracle.com/javase/8/docs/api/",
;;  "org.xml.sax." "https://docs.oracle.com/javase/8/docs/api/"}>