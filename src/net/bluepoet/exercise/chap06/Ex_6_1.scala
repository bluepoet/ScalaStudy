package net.bluepoet.exercise.chap06

/**
  * Created by Mac on 2017. 1. 22..
  */
object Ex_6_1 {
  def main(args: Array[String]) {
    println(matchFunction(100))
    println(matchFunction("hundred"))
    println(matchFunction(1000))
    println(matchFunction(100.5))
    println(matchFunction("thousand"))
  }

  def matchFunction(input: Any): Any = input match {
    case 100 => "hundred"
    case "hundred" => 100
    case etcNumber: Int => "입력값은 100이 아닌 Int 정수다"
    case _ => "기타"
  }
}
