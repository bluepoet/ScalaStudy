package net.bluepoet.exercise.chap07

/**
  * Created by Mac on 2017. 1. 22..
  */
object Ex_7_7 {
  def main(args: Array[String]) {
    var studentMap1 = Map(
      1 -> "bluepoet",
      2 -> "tester"
    )

    studentMap1 += (3 -> "aaa")
    studentMap1 -= 2

    var studentMap2 = Map(
      4 -> "bbb",
      5 -> "ccc"
    )

    var students = studentMap1 ++ studentMap2

    students.foreach(i => println(i))
    println(students.contains(5))
  }
}
