package net.bluepoet.exercise.chap07

/**
  * Created by Mac on 2017. 1. 22..
  */
object Ex_7_5 {
  def main(args: Array[String]) {
    val list3 = "a" :: "b" :: "c" :: Nil
    val list4 = 1 :: 2 :: 3 :: 4 :: Nil
    val list5 = Array(2, 2, 4)

    println(list4.exists(a => a > 3))
    println(list5.exists(_ > 3))
    println(list3++list4)
    println(list3.apply(0))
    println(list5.distinct.apply(0))
  }
}
