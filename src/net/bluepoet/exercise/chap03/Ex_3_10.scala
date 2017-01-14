package net.bluepoet.exercise.chap03

/**
  * Created by Mac on 2017. 1. 14..
  */
object Ex_3_10 {
  def main(args: Array[String]) {
    for((num, index) <- List('a','b','c','d').zipWithIndex) {
      println(num)
      println(index)
    }
  }
}
