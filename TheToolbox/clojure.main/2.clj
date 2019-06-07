(require '[clojure.main :as main])

(spit "hello.exe" ; <1>
  "(ns hello)
   (println \"Hello World!\")")

(main/load-script "hello.exe") ; <2>
;; "Hello World!"
;; nil