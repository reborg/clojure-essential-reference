(defn any-unwanted-word? [words]                        ; <1>
  (some #{"free" "sexy" "click"} words))

(defn any-link? [words]                                 ; <2>
  (some #(re-find #"http[s]?://.*\." %) words))

(defn any-blacklisted-sender? [words]                   ; <3>
  (some #{"spamz@email.com" "phish@now.co.uk"} words))

(def spam?                                              ; <4>
  (some-fn any-unwanted-word? any-link? any-blacklisted-sender?))

(defn words [email]                                     ; <5>
  (clojure.string/split email #"\s"))

(spam? (words "from: alex@tiv.com just wanted to say hi."))
;; nil

(spam? (words "from: nobody@all.tw, check this out: http://fast.link"))
;; "http://fast."

(spam? (words "from: nobody@all.tw, click here for a free gift."))
;; "click"