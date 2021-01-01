(set! *warn-on-reflection* true) ; <1>
(set! *unchecked-math* :warn-on-boxed)

(defn asum [a1 a2]
  (let [a (aclone (if (> (alength a1) (alength a2)) a1 a2))]
    (amap a idx ret
      (aset a idx
        (+ (aget a1 idx) (aget a2 idx))))))

Reflection warning, call to static method alength on RT can't be resolved (argument types: unknown).
Reflection warning, call to static method alength on RT can't be resolved (argument types: unknown).
Boxed math warning, call public static boolean Numbers.gt(Object,Object).
Reflection warning, call to static method aclone on RT can't be resolved (argument types: unknown).
Reflection warning, call to static method aclone on RT can't be resolved (argument types: unknown).
Reflection warning, call to static method alength on RT can't be resolved (argument types: unknown).
Boxed math warning, call public static boolean Numbers.lt(long,Object).
Reflection warning, call to static method aget on RT can't be resolved (argument types: unknown, int).
Reflection warning, call to static method aget on RT can't be resolved (argument types: unknown, int).
Boxed math warning, call public static Number Numbers.unchecked_add(Object,Object).
Reflection warning, call to static method aset on RT can't be resolved (argument types: unknown, int, Number).
Reflection warning, call to static method aset on RT can't be resolved (argument types: unknown, int, unknown).