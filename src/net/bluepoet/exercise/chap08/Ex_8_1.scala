package net.bluepoet.exercise.chap08

/**
  * Created by Mac on 2017. 2. 11..
  * https://twitter.github.io/scala_school/ko/collections.html 참고
  */
object Ex_8_1 {
  def main(args: Array[String]) {
    val o = List(1,2,3,4)
    println(o)

    val n = o.map(i => i * 10)
    println(n)

    o.foreach(i => print(i * 2 + ","))  // return void

    val b = o.filter(i => i >= 3).map(i => i * 2)
    println(b)

    val c = o.filter(i => i >= 3).map(i => i * 2)
    println(b)
  }
}
