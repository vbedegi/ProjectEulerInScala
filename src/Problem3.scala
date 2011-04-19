package com.vbedegi.projecteuler

class Problem3 {
  private def isPrime(x: BigInt) = BigInt(2) to (x / 2) forall (x % _ != 0)

  private def primeStream: Stream[Int] = Stream.from(2) filter (x => isPrime(x))

  private def primeFactors(x: BigInt) = primeStream takeWhile (i => BigInt(i) < x) filter (x % _ == 0)

  def printFactors {
    //primeFactors(BigInt("13195")) foreach (println _)
    primeFactors(600851475143L) foreach (println _)
  }
}
