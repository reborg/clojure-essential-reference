(def phone-book
  (hash-map "Jack N"    "381-883-1312" ; <1>
            "Book Shop" "381-144-1256"
            "Lee J."    "411-742-0032"
            "Jack N"    "534-131-9922"))

(phone-book "Jack N") ; <2>
;; "534-131-9922"