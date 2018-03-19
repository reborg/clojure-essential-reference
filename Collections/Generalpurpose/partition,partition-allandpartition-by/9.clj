(def temps [42 42 42 42 43 43 43 44 44 44 45
            45 46 48 45 44 42 42 42 42 41 41])

(map count (partition-by identity temps))     ; <1>
;; (4 3 3 2 1 1 1 1 4 2)                      ; <2>