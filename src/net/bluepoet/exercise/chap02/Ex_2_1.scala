package net.bluepoet.exercise.chap02

/**
  * Created by Mac on 2017. 1. 14..
  */
object Ex_2_1 {
  def main(args: Array[String]) {
    var a = "일반변수"
    val b = "final 변수"
//    var c   // initialize required
    var c = null
    var d = None
    var e: Int = 10
    a = "change!"
//    b = "change!"  // compile error
    println(a)
  }
}
