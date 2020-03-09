(drop n xs) ; <1>
(drop-while (constantly false) xs) ; <2>
(drop-last xs) ; <3>
(take n xs) ; <4>
(take-while (constantly true) xs) ; <5>
(take-last 1 xs) ; <6>
(nthrest xs n) ; <7>
(nthnext xs n) ; <8>