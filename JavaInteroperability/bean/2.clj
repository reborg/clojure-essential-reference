(bean (Object.)) ; <1>
;; {:class java.lang.Object}

(import 'javax.swing.JButton)
(pprint (bean (JButton.))) ; <2>
;; {:y 0,
;;  :selectedObjects nil,
;;  :componentPopupMenu nil,
;;  :focusable true,
;;  :managingFocus false,
;;  :validateRoot false,
;;  :requestFocusEnabled true,
;;  :containerListeners [],
;;  :rolloverSelectedIcon nil,
;;  :iconTextGap 4,
;;  :mnemonic 0,
;;  :debugGraphicsOptions 0,
;;  [...]