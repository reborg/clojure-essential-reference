(require '[no.disassemble :refer [disassemble]]) ; <1>
(println
  (disassemble ; <2>
    #(let [a 8] (case a 0 "0" 1 "1" :default))))

;; [...] ; <3>
 0  ldc2_w <Long 8> [12]
 3  lstore_1 [a]
 4  lload_1 [a]
 5  lstore_3 [G__22423]
 6  lload_3 [G__22423]
 7  l2i
 8  tableswitch default: 54
      case 0: 32
      case 1: 43
;; [...]