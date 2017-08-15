(macroexpand
  '(defn hello [person]
      (str "hello " person)))

(def hello                                ; <1>
  (clojure.core/fn                        ; <2>
    ([person] (str "hello " person))))

(hello "people")                          ; <3>

;; "hello people"