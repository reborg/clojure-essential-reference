(require '[criterium.core :refer [bench]]) ; <1>

(let [xs (range 1000)] (bench (last (mapcat range xs)))) ; 18ms ; <2>

(let [xs (range 1000)] (bench (last (sequence (mapcat range) xs)))) ; 48ms ; <3>
(let [xs (range 1000)] (bench (last (eduction (mapcat range) xs)))) ; 48ms

(let [xs (range 1000)] (bench (reduce + (mapcat range xs))))    ; 8.5ms ; <4>
(let [xs (range 1000)] (bench (transduce (mapcat range) + xs))) ; 6.9ms