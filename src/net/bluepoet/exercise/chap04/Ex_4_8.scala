package net.bluepoet.exercise.chap04

/**
  * Created by Mac on 2017. 1. 14..
  */
object Ex_4_8 {
  def main(args: Array[String]) {
    var robot = new Mazinga
    println(robot.shoot)
  }
}

class Mazinga extends Robot with M16 with K2 {
  override def shoot = "mazinga shoot"
}

abstract class Robot {
  def shoot = "robot shoot"
}

trait M16 extends Robot {
  override def shoot = super.shoot + "M16 shoot"
}

trait K2 extends Robot {
  override def shoot = super.shoot + "K2 shoot"
}
