(defn counter [cnt] ; <1>
  (fn [x] (swap! cnt inc) x))

(defn not-chunked [f] ; <2>
  (let [cnt (atom 0)]
    (f (drop 31 (map (counter cnt) (into () (range 100))))) @cnt))

(defn chunked [f] ; <3>
  (let [cnt (atom 0)]
    (f (drop 31 (map (counter cnt) (range 100)))) @cnt))

(not-chunked rest) ; 32
(not-chunked next) ; 33
(chunked rest) ; 32
(chunked next) ; 64