package net.bluepoet.exercise.chap08

/**
  * Created by Mac on 2017. 2. 11..
  */
object Ex_8_4 {
  def main(args: Array[String]) {
    val o = List(1,2,3,4,5)
    val oo = List(6,7,8)

    val n = o zip oo
    val nn = o ::: oo

    println(n)    // 쌍 없는 건 버려짐, return tuple
    println(nn)   // return List
  }
}
