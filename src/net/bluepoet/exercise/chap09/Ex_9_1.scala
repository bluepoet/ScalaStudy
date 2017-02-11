package net.bluepoet.exercise.chap09

/**
  * Created by Mac on 2017. 2. 11..
  */
object Ex_9_1 {
  def main(args: Array[String]) {
    val list = List(1, 2, 3, 4)

    def foreach(list: List[Int]): Int = {
      def add(list: List[Int], total: Int): Int = {
        list match {
          case List() => total
          case List(item) => total + item
          case head :: tail => add(tail, total + head)
        }
      }
      add(list, 0)
    }

    println(foreach(list))

    println(list.foldLeft(0)((total, item) => total + item))
  }
}