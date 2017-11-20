(loop [root words cnt 0]
  (if (< (count root) 512) ; <1>
    (str (type root) " " (count root) " elems, depth: " cnt)
    (recur (.left root) (inc cnt))))

;; "class java.util.ArrayList 321 elems, depth:8" ; <2>