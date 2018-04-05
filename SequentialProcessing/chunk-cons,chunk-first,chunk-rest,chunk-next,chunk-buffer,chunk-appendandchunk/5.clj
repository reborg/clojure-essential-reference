(import '[java.io FileInputStream InputStream])

(defn byte-seq [^InputStream is size]
  (let [ib (byte-array size)]
    ((fn step [] ; <1>
       (lazy-seq
         (let [n (.read is ib)] ; <2>
           (when (not= -1 n) ; <3>
             (let [cb (chunk-buffer size)] ; <4>
               (dotimes [i size] (chunk-append cb (aget ib i))) ; <5>
               (chunk-cons (chunk cb) (step)))))))))) ; <6>

(with-open [fis (FileInputStream. "/usr/share/dict/words")] ; <7>
  (let [bs (byte-seq fis 4096)]
    (String. (byte-array (take 20 bs)))))
;; "A\na\naa\naal\naalii\naam"