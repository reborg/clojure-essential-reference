user=> *out* ; <1>
#object["java.io.OutputStreamWriter@36dfbdaf"]
user=> (.write *out* "hello\n") ; <2>
hello ; <3>
nil ; <4>
user=>