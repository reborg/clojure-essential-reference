(defn get-classloader [f] ; <1>
  (.. f getClass getClassLoader))

(get-classloader #'+)
#object["jdk.internal.loader.ClassLoaders$AppClassLoader@277050dc"]

(get-classloader #'fn)
#object["jdk.internal.loader.ClassLoaders$AppClassLoader@277050dc"] ; <2>