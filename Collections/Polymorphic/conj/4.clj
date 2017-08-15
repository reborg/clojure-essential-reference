(import 'java.io.File)

(defn- fname [dir path]         ; <1>
  (str dir "/" path ".clj"))

(defn write [examples root]     ; <2>
  (loop [[title forms :as more] examples
         files []]
    (if title
      (let [dir (str root "/" title)
            paths (map-indexed #(vector (fname dir %1) %2) forms)] ; <3>
        (.mkdirs (File. dir))                                      ; <4>
        (doseq [[path content] paths] (spit path content))         ; <5>
        (recur (nnext more) (apply conj files paths)))             ; <6>
      (map first files))))

(def examples
  ["add" ["(+ 1 1)" "(+ 1 2 2)" "(apply + (range 10))"]
   "sub" ["(map - [1 2 3])" "(- 1)"]
   "mul" ["(*)" "(fn sq [x] (* x x))"]
   "div" ["(/ 1 2)" "(/ 1 0.)"]])

(write examples "/tmp")         ; <7>

;; ("/tmp/add/0.clj"
;;  "/tmp/add/1.clj"
;;  "/tmp/add/2.clj"
;;  "/tmp/sub/0.clj"
;;  "/tmp/sub/1.clj"
;;  "/tmp/mul/0.clj"
;;  "/tmp/mul/1.clj"
;;  "/tmp/div/0.clj"
;;  "/tmp/div/1.clj")