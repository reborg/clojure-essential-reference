(when-let [match (spam? (words "from: nobody@all.tw, click here for a free gift."))] ; <1>
  (throw (Exception. (str "Spam found: " match))))
;; Exception Spam found: click