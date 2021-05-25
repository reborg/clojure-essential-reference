(pprint @jdoc/*local-javadocs*) ; <1>
;; ()

(pprint (keys @jdoc/*remote-javadocs*)) ; <2>
;; ("java."
;;  "javax."
;;  "org.apache.commons.codec."
;;  "org.apache.commons.io."
;;  "org.apache.commons.lang."
;;  "org.ietf.jgss."
;;  "org.omg."
;;  "org.w3c.dom."
;;  "org.xml.sax.")