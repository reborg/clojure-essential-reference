(diff 1.0 1)               ; <1>
;; [1.0 1 nil]

(diff [1 "x" 3 4]          ; <2>
     '(1 "y" 3 5))
;; [[nil "x" nil 4]
;;  [nil "y" nil 5]
;;  [1 nil 3]]

(diff {:a "a" :b {:c "c"}} ; <3>
      {:a 1 :b {:c 2}})
;; ({:a "a" :b {:c "c"}}
;;  {:a 1 :b {:c 2}}
;;  nil)

(diff [1 {:a [1 2] :b {:c "c"}}]            ; <4>
      [1 {:a [1 3] :b {:c "c" :d "d"}}])
;; [[nil {:a [nil 2]}]
;;  [nil {:a [nil 3] :b {:d "d"}}]
;;  [1 {:a [1] :b {:c "c"}}]]

(diff (int-array [1 2 3])                   ; <5>
      (int-array [1 4 3]))
;; [[nil 2] [nil 4] [1 nil 3]]

(diff #{:a :c :b} #{:c :b :a})              ; <6>
;; [nil nil #{:a :b :c}]

(diff {"x" 42} (sorted-map :x 42))          ; <7>
;; java.lang.ClassCastException