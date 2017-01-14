package net.bluepoet.exercise.chap04

/**
  * Created by Mac on 2017. 1. 14..
  */
object Ex_4_2 {
  def main(args: Array[String]) {
    val apple = new Fruit("apple")
    println(apple.name)
  }
}

//class Fruit(input: String) {
//  var name = input
//}

case class Fruit(name: String)