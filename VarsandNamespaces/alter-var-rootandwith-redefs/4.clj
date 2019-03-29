(defn fetch-title [url] ; <1>
  (let [input (slurp url)]
    (last
      (re-find #"Title: (.*)\." input))))

(def sample-article "Some Title: Salary increases announced.")

(with-redefs [slurp (constantly sample-article)] ; <2>
  (= "Salary increases announced" (fetch-title "url")))
;; true