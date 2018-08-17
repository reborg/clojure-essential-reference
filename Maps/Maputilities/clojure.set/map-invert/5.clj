(def scramble-key ; <1>
  {\a \t \b \m \c \o \d \l
   \e \z \f \i \g \b \h \u
   \i \h \j \n \k \s \l \r
   \m \a \n \q \o \d \p \e
   \q \k \r \y \s \f \t \c
   \u \p \v \w \w \x \x \j
   \y \g \z \v \space \space})

(defn scramble [text scramble-key] ; <2>
  (apply str (map scramble-key text)))

(defn unscramble [text scramble-key] ; <3>
  (apply str (map (map-invert scramble-key) text)))

(scramble "try to read this if you can" scramble-key)
;; "cyg cd yztl cuhf hi gdp otq"

(unscramble "cyg cd yztl cuhf hi gdp otq" scramble-key) ; <4>
;; "try to read this if you can"