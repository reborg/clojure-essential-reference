(defn pipe [cmd1 & cmds] ; <1>
  (reduce
    (fn [{out :out} cmd] ; <2>
      (apply sh (conj cmd :in out)))
    (apply sh cmd1)
    cmds))

(println
  (:out
    (pipe ; <3>
      ["env"]
      ["grep" "-i" "java"])))

;; JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home
;; JAVA_MAIN_CLASS_61966=clojure.main
;; _=/usr/bin/java
;; LEIN_JAVA_CMD=java
;; JAVA_MAIN_CLASS_62001=clojure.main