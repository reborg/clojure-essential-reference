(the-ns 'notavail) ; <1>
;; Exception No namespace: notavail found

(the-ns 'clojure.edn) ; <2>
;; #object[clojure.lang.Namespace 0x20312893 "clojure.edn"]

(the-ns *ns*) ; <3>
;; #object[clojure.lang.Namespace 0xcc62a3b "user"]