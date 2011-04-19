package com.vbedegi.projecteuler

class Problem4 {
  private def theRange = Range(999, 100, -1);

  private def candidates = for (x <- theRange; y <- theRange) yield x * y

  private def isPalindrome(x: Int) = x.toString == x.toString.reverse

  def calculate = candidates filter (isPalindrome(_)) max
}
