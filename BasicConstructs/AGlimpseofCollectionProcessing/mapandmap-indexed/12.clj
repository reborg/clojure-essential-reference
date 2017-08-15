(let [res (map inc (range 1e7))] (first res) (last res))  ; <1>

(let [res (map inc (range 1e7))] (last res) (first res))  ; <2>