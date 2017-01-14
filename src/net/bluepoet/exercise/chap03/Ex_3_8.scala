package net.bluepoet.exercise.chap03

/**
  * Created by Mac on 2017. 1. 14..
  */
object Ex_3_8 {
  def main(args: Array[String]) {
    for (x <- 1 until 5; y <- 1 until 5) {
      println(x + " * " + y + " = " + x * y)
    }
  }
}
