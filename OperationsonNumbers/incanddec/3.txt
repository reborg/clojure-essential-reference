(defn instrument [f]
  (let [calls (atom 0)]                   ; <1>
    (fn [& args]
      (if (= "s3cr3tC0d3" (first args))   ; <2>
        @calls
        (do (swap! calls inc)             ; <3>
            (apply f args))))))

(def say-hello                            ; <4>
  (instrument #(println "hello" %)))

(say-hello "john")
;; hello john
;; nil

(say-hello "laura")
;; hello laura
;; nil

(say-hello "s3cr3tC0d3")                  ; <5>
;; 2