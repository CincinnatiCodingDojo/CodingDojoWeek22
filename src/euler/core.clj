(ns euler.core
  (:gen-class))

(defn pairs-of-three-digit-numbers []
  (for [x (range 100 1000) y (range 100 1000)] [x y]))

(defn product [[x y]]
  (* x y))

(defn palindrome? [number]
  (= (seq (str number)) (reverse (seq (str number))))
  )

(defn euler-4 []
  (->> (pairs-of-three-digit-numbers)
       (map product)
       (filter palindrome?)
       (apply max)))
