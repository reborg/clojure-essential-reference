(require '[clojure.zip :as zip]) ; <1>
(require '[clojure.xml :as xml])
(require '[clojure.java.io :as io])

(def vzip ; <2>
  (zip/vector-zip
    [(subvec [1 2 2] 0 2)
     [3 4 [5 10 (vector-of :int 11 12)]]
     [13 14]]))

(def szip ; <3>
  (zip/seq-zip
    (list
      (range 2)
      (take 2 (cycle [1 2 3]))
      '(3 4 (5 10))
      (cons 1 '(0 2 3)))))

(def xzip  ; <4>
  (zip/xml-zip
    (->
        "<b>
            <a>3764882</a>
            <c>80.12389</c>
            <f>
              <f1>77488</f1>
              <f2>1921.89</f2>
            </f>
          </b>"
       .getBytes io/input-stream xml/parse)))