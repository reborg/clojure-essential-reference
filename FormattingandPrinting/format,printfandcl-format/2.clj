(require '[clojure.pprint :refer [cl-format]]) ; <1>

(cl-format nil "~:d" 1000000) ;; "1,000,000" ; <2>
(cl-format nil "~b" 10) ;; "1010" ; <3>
(cl-format nil "Anno Domini ~@r" 25) ;; "Anno Domini XXV" ; <4>

(cl-format nil "~r" 158) ;; "one hundred fifty-eight" ; <5>
(cl-format nil "~:r and ~:r" 1 2) ;; "first and second" ; <6>
(cl-format nil "~r banana~:p" 1) ;; "one banana"
(cl-format nil "~r banana~:p" 2) ;; "two bananas" ; <7>