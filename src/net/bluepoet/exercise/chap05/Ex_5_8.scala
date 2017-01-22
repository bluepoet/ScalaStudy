package net.bluepoet.exercise.chap05

/**
  * Created by Mac on 2017. 1. 21..
  */
object Ex_5_8 {

  def printlnString(args: String*): Unit = {
    for(arg <- args) {
      println(arg)
    }
  }

  def main(args: Array[String]) {
    printlnString("string1", "string2", "string3")
  }
}
