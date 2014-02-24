(ns euler.core-test
  (:require [midje.sweet :refer :all]
            [euler.core :refer :all]))

(fact "should generate all three digit pairs"
  (first (pairs-of-three-digit-numbers)) => [100,100]
  (last (pairs-of-three-digit-numbers)) => [999,999]
  (count (pairs-of-three-digit-numbers)) => (* 900 900))

(fact "should create a product from a pair of 2 three digit numbers"
  (product [100,100]) => 10000
  (product [200 200]) => 40000 )

(fact "palindrome? should tell whether a number is a palindrome"
  (palindrome? 1001) => true
  (palindrome? 1002) => false
  )


(fact "the solution for Project Euler problem #4 is _________"
  (euler-4) => 906609)
