package net.bluepoet.exercise.chap05

/**
  * Created by Mac on 2017. 1. 21..
  */
object Ex_5_7 {
  def main(args: Array[String]) {
    val result = calc(x => x * x, 2, 5)
    println(result)
  }

  def calc(f: Int => Int, start: Int, end: Int): Int = {
    def loop(index: Int, sum: Int): Int = {
      if(index > end) sum
      else loop(index + 1, f(index) + sum)
    }

    loop(start, 0)
  }
}
