(def a-var 1)

(future ; <1>
  (alter-var-root
    #'a-var
    (fn [old]
      (Thread/sleep 10000)
      (inc old))))

;; blocking call for 10 seconds
a-var ; <2>
2