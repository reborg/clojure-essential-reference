(update-proxy ; <1>
  etchosts
  {"concat"
    #(let [^File f1 %1 ^File f2 %2]
       (.createNewFile ^File f2) ; <2>
       (spit (.getPath f2) (slurp f1) :append true)
       f2)})

(-> etchosts ; <3>
  (.concat (cfile "temp3.txt"))
  (.concat (cfile "hosts-copy.txt")))