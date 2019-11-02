(when-let [match (spam? (words "from: nobody@all.tw, click here for a free gift."))]
  (throw (Exception. (str "Spam found: " match))))
;; Exception Spam found: click