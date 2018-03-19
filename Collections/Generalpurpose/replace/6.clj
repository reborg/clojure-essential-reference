(def text "You provided the following: user {usr} password {pwd}")
(def sub {"{usr}" "'rb075'" "{pwd}" "'xfrDDjsk'"})

(transduce
  (comp
    (replace sub)                     ; <1>
    (interpose " "))
  str
  (clojure.string/split text #"\s"))  ; <2>

;; "You provided the following: user 'rb075' password 'xfrDDjsk'"