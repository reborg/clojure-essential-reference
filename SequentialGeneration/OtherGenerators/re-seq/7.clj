(import '[java.io InputStream]
        '[java.net URL]
        '[java.util Scanner]
        '[java.util.regex Pattern])

(defn restream-seq [^Pattern re ^InputStream is] ; <1>
  (let [s (Scanner. is "UTF-8")]
    ((fn step []
       (if-let [token (.findInLine s re)]
         (cons token (lazy-seq (step)))
         (when (.hasNextLine s) (.nextLine s) (step)))))))

(defn pi-seq [is] ; <2>
  (sequence
    (comp
      cat
      (map int)
      (map #(mod % 48)))
    (restream-seq #"\d{10}" is)))

(def pi-book (URL. "http://www.gutenberg.org/files/50/50.txt"))

(with-open [is (.openStream pi-book)] ; <3>
  (doall (take 20 (pi-seq is))))
;; (1 4 1 5 9 2 6 5 3 5 8 9 7 9 3 2 3 8 4 6)