(def DNA "CTATCTTTTAATCGGTTCTTGCAGTGAGATACATTCCACATGCCCGACTT")

(->> DNA
  reverse       ; <1>
  (replace {\A \T \T \A \C \G \G \C}) ; <2>
  (apply str))  ; <3>

;; "AAGTCGGGCATGTGGAATGTATCTCACTGCAAGAACCGATTAAAAGATAG"