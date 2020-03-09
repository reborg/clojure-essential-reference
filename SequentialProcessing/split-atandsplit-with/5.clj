(split-with (complement #{\a \e \i \o \u}) "hello") ; <1>
;; [(\h) (\e \l \l \o)]