(defmacro defrecord* [name fields & impl]
  `(defrecord ~name ~fields                              ; <1>
     ~@impl
     clojure.lang.IFn
     (~'invoke [this# key#]                              ; <2>
      (get this# key#))
     (~'invoke [this# key# not-found#]
      (get this# key# not-found#))
     (~'applyTo [this# args#]                            ; <3>
      (case (count args#)
        (1 2) (this# (first args#) (second args#))
        (throw (AbstractMethodError.))))))

(defrecord* Foo [a])                                     ; <4>

((Foo. 1) :a)
;; 1

((Foo. 1) :b 2)
;; 2