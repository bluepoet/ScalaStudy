package net.bluepoet.exercise.chap05

/**
  * Created by Mac on 2017. 1. 21..
  */
object Ex_5_6 {
  def main(args: Array[String]) {
    val g = f
    val a: (Int => Int) = f
    println(f(1))
  }

//  def f(i: Int) = i
  def f = (i: Int) => i
}
