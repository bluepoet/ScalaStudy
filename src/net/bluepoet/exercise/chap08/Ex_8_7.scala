package net.bluepoet.exercise.chap08

import java.util

/**
  * Created by Mac on 2017. 2. 11..
  */
object Ex_8_7 {
  def main(args: Array[String]) {
    val o = List(1,2,3,4,5,6,0)

    val n = o.drop(4)
    val nn = o.dropWhile(i => i < 3)

    println(n)
    println(nn)

    val a = List(List(1,2,3,4), List(5,6))
    val b = a.flatten
    println(b)
  }
}
