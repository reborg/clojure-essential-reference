(defn identifier [x]
  (let [classname #(.getName ^Class %) ; <1>
        split #(.split % "\\.")
        typex (type x)]
    (apply str
      (interpose "-"
        (concat
          (split (classname typex)) ; <2>
          (mapcat (comp split classname) (supers typex))))))) ; <3>

(identifier #"regex") ; <4>
;; "java-util-regex-Pattern-java-io-Serializable-java-lang-Object"