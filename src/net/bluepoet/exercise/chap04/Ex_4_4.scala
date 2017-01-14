package net.bluepoet.exercise.chap04

/**
  * Created by Mac on 2017. 1. 14..
  */
object Ex_4_4 {
  def main(args: Array[String]) {
    val richUser = new PaidUser("bluepoet", 38, 'M', 1000000)
    richUser.sayName
    richUser.showMoney
  }
}

class User(name: String, age: Int, sex: Char) {
  val sayName = println("my name is " + name)
}

class PaidUser(name: String, age: Int, sex: Char, money: Int)
  extends User(name, age, sex) {
  val showMoney = println("my money is " + money)
}