package com.vbedegi.projecteuler

class Problem5 {

  def countByValue(list: List[Int]) = {
    list map (x => (x, list.count(y => y == x)))
  }

  def getIter(iter: Int, list: List[Int]): Int = {
    var mupltiples = (1 to 20) map (_ * iter) toList
    val newList = list ::: mupltiples
    val cBV = countByValue(newList)

    val huszasok = cBV filter (_._2 == 20) toList

    if (!huszasok.isEmpty) return huszasok.head._1
    getIter(iter + 1, newList)
  }

  def tryit(x: Int): Int = {
    if ((2 to 20 forall (z => x % z == 0)))
      x
    else
      tryit(x + 1)
  }

  def doit {
    //val lmc = getIter(1, Nil)
    val lmc = tryit(20)
    println(lmc)


  }
}