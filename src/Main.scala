package com.vbedegi.projecteuler

object Main {
  def main(args: Array[String]) = {

    val p5 = new Problem5
    p5.doit

    //archive
  }

  def archive {
    val p1 = new Problem1
    println(p1 sum)

    val p2 = new Problem2
    println(p2.sum)

    val p3 = new Problem3
    p3.printFactors

    val p4 = new Problem4
    println(p4.calculate)
  }
}