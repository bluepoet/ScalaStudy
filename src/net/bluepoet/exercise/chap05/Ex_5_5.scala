package net.bluepoet.exercise.chap05

/**
  * Created by Mac on 2017. 1. 21..
  */
object Ex_5_5 {
  def main(args: Array[String]) {
    val thisYear = 2017

    val fixedValueFunction = go(thisYear)_

    fixedValueFunction("test1")
    fixedValueFunction("test2")
    fixedValueFunction("test3")
  }

  def go(thisYear: Int)(string: String) = {
    println(string + " : " + thisYear)
  }
}
