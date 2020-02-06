(defn by-type [ext]     ; <1>
  (fn [^String fname]
    (.endsWith fname ext)))

(defn lazy-scan []      ; <2>
  (->> (java.io.File. "/")
    file-seq
    (map (memfn getPath))
    (filter (by-type ".txt"))
    (seque 50)))

(defn go []
  (loop [results (partition 5 (lazy-scan))] ; <3>
    (println (with-out-str (clojure.pprint/write (first results))))
    (println "more?")
    (when (= "y" (read-line))
      (recur (rest results)))))

(go)

("/usr/local/Homebrew/docs/robots.txt" ; <4>
 "/usr/local/Homebrew/LICENSE.txt"
 "/usr/local/var/homebrew/linked/z3/todo.txt"
 "/usr/local/var/homebrew/linked/z3/LICENSE.txt"
 "/usr/local/var/homebrew/linked/z3/share/z3/examples/c++/CMakeLists.txt")
;; more?