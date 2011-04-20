package com.vbedegi.projecteuler

class Problem5 {
  def multipleOfEach(x: Int): Boolean = Range(20, 2, -1).forall(z => x % z == 0)

  def calculate = Stream.from(1) filter (multipleOfEach(_)) take 1
}