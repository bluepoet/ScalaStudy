package net.bluepoet.exercise.chap04

/**
  * 스칼라는 인터페이스가 없다 : https://dzone.com/articles/why-scala-doesn%E2%80%99t-have-java
  * Created by Mac on 2017. 1. 14..
  */
object Ex_4_5 {
  def main(args: Array[String]) {
    val bird = new Animal
    bird.fly
    bird.eat

    val fish = new Animail2
    fish.swim

    val pig = new Pig
    pig.shout
    pig.swim
  }
}

abstract class Animail3 {
  def shout
}

class Pig extends Animail3 with Flying with Swimming {
  override def shout: Unit = println("shout")
  def swim = println("Pig swim")
}

class Animail2 extends Swimming {
  def swim = println("swim")
}
class Animal extends Flying with Eating {
  override def fly = println("override fly")
}

trait Flying {
  def fly = println("fly")
}

trait Swimming {
  def swim
}

trait Eating {
  def eat = println("eat")
}


