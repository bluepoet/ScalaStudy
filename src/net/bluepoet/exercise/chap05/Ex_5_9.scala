package net.bluepoet.exercise.chap05

/**
  * Created by Mac on 2017. 1. 21..
  */
object Ex_5_9 {

  def default(a: Int = 4, b: Int = 5): Int = a + b

  def main(args: Array[String]) {
    println(default())
  }
}
