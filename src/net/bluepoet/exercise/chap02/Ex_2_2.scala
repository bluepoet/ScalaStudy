package net.bluepoet.exercise.chap02

/**
  * Created by Mac on 2017. 1. 14..
  */
object Ex_2_2 {
  def main(args: Array[String]) {
    var a: Int = 5
    var b = a
    a = 10
    println(a)
    println(b)

    type Name = String
    type Person = (String, Int)
    type FType = String => Int

    val name: Name = "bluepoet"
    val person: Person = ("bluepoet", 38)
    val f: FType = text => text.toInt

    println(name)
    println(person)
    println(f("25"))
  }
}
