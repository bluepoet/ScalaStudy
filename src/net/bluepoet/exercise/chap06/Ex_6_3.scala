package net.bluepoet.exercise.chap06

/**
  * Created by Mac on 2017. 1. 22..
  */
object Ex_6_3 {
  def main(args: Array[String]) {
    val number1 = "010-3030-3939"
    val number2 = "119"
    val number3 = "포도먹은돼지"
    val numberList = List(number1, number2, number3)

    for (number <- numberList) {
      number match {
        case Emergency() => println("sos")
        case Normal(number) => println("normal")
        case _ => println("nono!")
      }
    }
  }
}

object Emergency {
  def unapply(number: String): Boolean = {
    if (number.length == 3 && number.forall(_.isDigit)) true
    else false
  }
}

object Normal {
  def unapply(number: String): Option[Int] = {
    try {
//      var o = number.replaceAll("-", "")
      Some(number.replaceAll("-", "").toInt)
    } catch {
      case _: Throwable => None
    }
  }
}
