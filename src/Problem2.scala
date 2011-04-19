package com.vbedegi.projecteuler

class Problem2 {
  // slow!
  //  private def fibonacci(x: Int): Int = x match {
  //    case 0 => 0
  //    case 1 => 1
  //    case x => fibonacci(x - 1) + fibonacci(x - 2)
  //  }

  private def fibonacci(x: Int): Int = {
    if (x == 0) return 0
    if (x == 1) return 1
    fibonacci(x - 1) + fibonacci(x - 2)
  }

  private def fibonacciStream(x: Int): Stream[Int] = {
    Stream.cons(fibonacci(x), fibonacciStream(x + 1))
  }

  def sum = {
    fibonacciStream(0) takeWhile (_ < 4000000) filter (_ % 2 == 0) sum
  }
}