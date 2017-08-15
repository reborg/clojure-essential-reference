(defmacro with-locals-to-string [& body]
  (let [locals (vec (keys &env))]         ; <1>
    `(let [~locals (mapv str ~locals)]    ; <2>
       ~@body)))

(let [a 1
      b [:foo :bar]]
  (with-locals-to-string [a b]))          ; <3>

;; ["1" "[:foo :bar]"]