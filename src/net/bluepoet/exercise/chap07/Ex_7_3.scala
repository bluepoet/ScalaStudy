package net.bluepoet.exercise.chap07

/**
  * Created by Mac on 2017. 1. 22..
  */
object Ex_7_3 {
  def main(args: Array[String]) {
    val list = "a" :: "b":: "c" :: Nil
    for(x <- 0 until list.size)
      println(list(x))

    val list2 = "d" :: "e" :: Nil
    val list3 = list ::: list2

    for(x <- 0 until list3.size)
      println(list3(x))
  }
}
