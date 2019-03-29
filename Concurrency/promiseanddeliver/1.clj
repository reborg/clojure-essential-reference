(def p (promise))

(future (println "Thread 1 got access to" @p)) ; <2>
(future (println "Thread 2 got access to" @p))
(future (println "Thread 3 got access to" @p))

(deliver p :location) ; <3>
;; #object[clojure.core$promise$reify__7005 0x16fb93fb {:status :ready, :val :location}]
;; Thread 3 got access to Thread 2 got access to Thread 1
;; got access to  :location:location:location