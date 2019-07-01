(with-open [r (reader "/usr/share/dict/words")
            w (writer "/tmp/words" :append true)] ; <1>
  (doseq [line (line-seq r)]
    (.write w (str (upper-case line) "\n")))) ; <2>