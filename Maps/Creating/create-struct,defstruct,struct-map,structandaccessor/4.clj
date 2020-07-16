(struct (create-struct :a :b :c) 1 2 3) ; <1>
;; {:a 1, :b 2, :c 3}

(type (defrecord abc [a b c])) ; <2>
;; java.lang.Class

(abc. 1 2 3) ; <3>
;; #user.abc{:a 1, :b 2, :c 3}