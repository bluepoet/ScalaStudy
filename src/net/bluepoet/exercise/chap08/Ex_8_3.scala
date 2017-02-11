package net.bluepoet.exercise.chap08

/**
  * Created by Mac on 2017. 2. 11..
  */
object Ex_8_3 {
  def main(args: Array[String]) {
    val o = List(1,2,3,4)
    val n = o.foldLeft(0){(i: Int, j: Int) => println("i: " + i + " j: " + j); i + j}
    println(n)

    val m = o.foldRight(0){(i, j) => println("i: " + i + " j: " + j); i + j}
    println(m)

    val k = o.partition(i => i < 3)
    println(k)
    println(k._1)
    println(k._2)
  }
}
