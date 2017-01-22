package net.bluepoet.exercise.chap06

/**
  * Created by Mac on 2017. 1. 22..
  */
object Ex_6_2 {
  def main(args: Array[String]) {
    val person1 = Person("bluepoet", 1, "developer")
    val person2 = Person("tester", 1, "tester")
    val person3 = Person("emin", 1, "designer")
    val person4 = Person("yonghoon1112", 12, "boss")

    matchAndHi(person1)
    matchAndHi(person2)
    matchAndHi(person3)
    matchAndHi(person4)
  }

  case class Person(name: String, age: Int, rank: String)

  def matchAndHi(person: Person): Unit = person match {
    case Person("bluepoet", 1, "developer") => println("bluepoet")
    case Person("tester", 1, "tester") => println("tester")
    case Person("emin", 1, "designer") => println("emin002")
    case _ => println("etc")
  }
}
