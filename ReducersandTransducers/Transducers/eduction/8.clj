(defn busy-mem []
  (str (/ (-
    (.. Runtime getRuntime totalMemory)
    (.. Runtime getRuntime freeMemory))
  1024. 1024.) " Mb"))

(System/gc) (busy-mem)  ; <1>
;; 5.574 Mb

(def s1 (eduction (map inc) (range 1e7)))
(last s1)

(System/gc) (busy-mem)  ; <2>
;; 7.615 Mb

(def s2 (sequence (map inc) (range 1e7)))
(last s2)

(System/gc) (busy-mem)  ; <3>
;; 304.5126 Mb