(def jdk11-javadoc ; <1>
  (str (System/getProperty "user.home")
       "/javadocs/jdk11/api/java.base"))

(binding [jdoc/*local-javadocs* (ref [jdk11-javadoc])] ; <2>
  (jdoc/javadoc (Object.)))