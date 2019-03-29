(import 'java.util.HashMap)

(def java-map (HashMap. {:a "1" :b nil}))

(prn java-map) ; <1>
;; {:a "1", :b nil}

(println java-map) ; <2>
;; #object[java.util.HashMap 0x1ffddcad {:a=1, :b=null}]