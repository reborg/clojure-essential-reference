(def op1 (ref 0)) ; <1>
(def op2 (ref 1))
(def result (ref []))

(defn perform [] ; <2>
  (dosync
    (dotimes [i 3] ; <3>
      (println (format "###-%s-###" ; <4>
        (hash (Thread/currentThread))))
      (alter op1 inc)
      (alter op2 inc)
      (alter result conj (+ @op1 @op2))
      (print
        (format "%s + %s = %s (i=%s)\n"
          @op1 @op2 (+ @op1 @op2) i))
      (Thread/sleep 300))
    @result))

(perform) ; <5>
;; ###-2023564354-###
;; 1 + 2 = 3 (i=0)
;; ###-2023564354-###
;; 2 + 3 = 5 (i=1)
;; ###-2023564354-###
;; 3 + 4 = 7 (i=2)
;; [3 5 7]

(perform)
;; ###-2023564354-###
;; 4 + 5 = 9 (i=0)
;; ###-2023564354-###
;; 5 + 6 = 11 (i=1)
;; ###-2023564354-###
;; 6 + 7 = 13 (i=2)
;; [3 5 7 9 11 13]