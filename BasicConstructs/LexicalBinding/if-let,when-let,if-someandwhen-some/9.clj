(require '[clojure.core.async :refer
          [go go-loop chan >! <! <!! close!]])

(defn- master [items in]                ; <1>
  (go
    (doseq [item items]
      (>! in item))
    (close! in)))

(defn- worker [out]                     ; <2>
  (let [in (chan)]
    (go-loop []
       (if-some [item (<! in)]          ; <3>
         (do
           (>! out (str "*" item "*"))  ; <4>
           (recur))
         (close! out)))                 ; <5>
    in))

(defn process [items]                   ; <6>
  (let [out (chan)]
    (master items (worker out))         ; <7>
    (loop [res []]
      (if-some [item (<!! out)]         ; <8>
        (recur (conj res item))
        res))))