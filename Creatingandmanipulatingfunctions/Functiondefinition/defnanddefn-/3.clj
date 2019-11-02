(macroexpand  ; <1>
  '(defn hello [person]
      (str "hello " person)))

;; (def hello
;;   (clojure.core/fn ; <2>
;;     ([person] (str "hello " person))))

(hello "people") ; <3>

;; "hello people"