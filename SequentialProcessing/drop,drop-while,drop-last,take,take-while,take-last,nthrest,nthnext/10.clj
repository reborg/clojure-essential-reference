(drop l xs) ; <1>
(drop-while (constantly false) xs) ; <2>
(drop-last xs) ; <3>
(take l xs) ; <4>
(take-while (constantly true) xs) ; <5>
(take-last 1 xs) ; <6>
(nthrest xs l) ; <7>
(nthnext xs l) ; <8>