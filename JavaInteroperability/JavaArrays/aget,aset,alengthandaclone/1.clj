(def a (into-array [:a :b :c]))

(aget a 0) ; <1>
;; :a

(aset a 0 :changed) ; <2>
;; :changed

(vec a) ; <3>
;; [:changed :b :c]