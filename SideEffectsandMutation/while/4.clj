(import
  'java.io.File
  'javax.xml.bind.DatatypeConverter
  'java.security.MessageDigest
  'java.security.DigestInputStream)

(require '[clojure.java.io :as io])

(defn sha [file]
  (let [sha (MessageDigest/getInstance "SHA-256")]                    ; <1>
    (with-open [dis (DigestInputStream. (io/input-stream file) sha)]  ; <2>
      (while (> (.read dis) -1)))                                     ; <3>
    (DatatypeConverter/printHexBinary (.digest sha))))                ; <4>

(md5-file (File. "/etc/hosts"))
;; "04F186E74288A10E09DFBF8A88D64A1F33C0E698AAA6B75CDB0AC3ABA87D5644"