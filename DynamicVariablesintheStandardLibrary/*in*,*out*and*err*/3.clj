(.write *err* "error!\n") ; <1>
nil
user=>

user=> (binding [*err* *out*] (.write *err* "error!\n")) ; <2>
error!
nil
user=>