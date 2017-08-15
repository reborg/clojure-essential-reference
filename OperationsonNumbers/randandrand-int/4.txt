(import 'java.awt.image.BufferedImage
        'java.util.Random
        'javax.imageio.ImageIO
        'java.io.File)

(def ^:const width 256)
(def ^:const height 256)
(def ^:const black 0xffffff)
(def ^:const white 0x000000)

(defn coords [x y]
  (for [m (range x)
        n (range y)] [m n]))

(defn save! [img]
 (ImageIO/write img "PNG" (File. "/tmp/rand-noise.png")))

(defn rand-pixel [r]
  (if (== 0 (bit-and (.nextInt r) 1))
    white
    black))

(defn a []
  (let [r (Random.)
        img (BufferedImage. width height BufferedImage/TYPE_BYTE_BINARY)]
    (doseq [[x y] (coords width height)]
      (.setRGB img x y (rand-pixel r)))
    (save! img)))