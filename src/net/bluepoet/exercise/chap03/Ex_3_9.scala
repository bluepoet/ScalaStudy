package net.bluepoet.exercise.chap03

/**
  * Created by Mac on 2017. 1. 14..
  */
object Ex_3_9 {
  def main(args: Array[String]) {
    for(i <- (1 to 10) if (i % 2 == 0)) {
      println(i)
    }
  }
}
