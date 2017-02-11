package net.bluepoet.exercise.chap09

/**
  * Created by Mac on 2017. 2. 11..
  */
object Ex_9_4 {
  def main(args: Array[String]) {
    val input = scala.io.StdIn.readLine("inptu value: ")
    val result: Either[String, Int] = try {
      Right(input.toInt)
    } catch {
      case e: Exception => Left(input)
    }

    println(result.getClass)
  }
}
