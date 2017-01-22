package net.bluepoet.exercise.chap05

/**
  * Created by Mac on 2017. 1. 21..
  */
object Ex_5_3 {

  def people(n: Int) = {
    println("people start!")
    n
  }

  def dropship(n: Int) = {
    println("dropship start!")
    println(n + " boarded")
  }

  def dropship1(n : => Int) = {
    println("dropship start!")
    println(n + " boarded")
  }

  def main(args: Array[String]) {
    dropship(people(5))
    dropship1(people(5))
  }
}
