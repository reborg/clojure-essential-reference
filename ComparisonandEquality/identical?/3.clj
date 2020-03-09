(import 'java.util.concurrent.LinkedBlockingQueue)

(def channel (LinkedBlockingQueue. 1)) ; <1>
(def SENTINEL (Object.))               ; <2>

(defn encode []                  ; <3>
  (let [e (.take channel)]
    (if (identical? SENTINEL e)
      (println "done")
      (do (println (hash e))
          (recur)))))

(defn start []                   ; <4>
  (let [out *out*]
    (.start (Thread.
        #(binding [*out* out]
          (encode))))))

(do
  (start)
  (.offer channel :a)
  (.offer channel (Object.))     ; <5>
  (.offer channel SENTINEL)
  (.offer channel :a))           ; <6>

;; -2123407586
;; 1430420663
;; done