package net.bluepoet.exercise.chap05

/**
  * Created by Mac on 2017. 1. 21..
  */
object Ex_5_2 {

  def sum(a: Int, b: Int): Int = {
    a + b
  }

  def sum1(a: Int, b: Int): Int = a + b

  def main(args: Array[String]) {
    val result = sum(1, 2)
    println(result)
    println(sum1(2, 4))
  }
}
