(send a slow-update) ; <1>
(time (await-for 2000 a)) ; <2>
;; "Elapsed time: 2003.144351 msecs"
;; false