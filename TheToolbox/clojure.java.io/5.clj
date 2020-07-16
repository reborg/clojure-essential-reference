(with-open [r (reader "/usr/share/dict/words" :encoding "UTF-16")
            w (writer "/tmp/words" :append true :encoding "UTF-16")] ; <1>
  (doseq [line (line-seq r)]
    (.write w (str (upper-case line) "\n")))) ; <2>