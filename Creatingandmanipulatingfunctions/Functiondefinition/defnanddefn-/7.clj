(defn hello
  "A function to say hello"    ; <1>
  [person]
  (str "Hello " person))

(clojure.repl/doc hello)       ; <2>
;; -------------------------
;; user/hello
;; ([person])
;;   A function to say hello

;; ([person])
;;     A function to say hello ; <3>
;; nil

(:doc (meta #'hello))          ; <4>

;; "A function to say hello"