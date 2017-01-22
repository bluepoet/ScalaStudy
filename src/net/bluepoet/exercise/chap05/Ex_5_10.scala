package net.bluepoet.exercise.chap05

/**
  * Created by Mac on 2017. 1. 21..
  */
object Ex_5_10 {
  class SomeClass {
    def apply(m: Int) = method(m)
    def method(i: Int) = i + i
    def method2(s: String) = s
  }

  implicit  def doubleToInt(d: Double) = d.toInt
//  implicit  def doubleToInt1(d: Double) = d.toInt
  val x: Int = 18.0

  def main(args: Array[String]) {
    val something = new SomeClass

    println(something(2))
  }
}
