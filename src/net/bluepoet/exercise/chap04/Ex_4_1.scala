package net.bluepoet.exercise.chap04

/**
  * Created by Mac on 2017. 1. 14..
  */
object Ex_4_1 {
  def main(args: Array[String]) {
    val car = new Vehicle()
    println(car.price)
    println(car.hood)
  }
}

class Vehicle() {
  var price: Int = 10000
  var hood: String = "expensive"
}
