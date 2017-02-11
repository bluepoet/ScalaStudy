package net.bluepoet.exercise.chap09

import java.io.{File, PrintWriter}

/**
  * Created by Mac on 2017. 2. 11..
  */
object Ex_9_5 {
  def main(args: Array[String]) {
    val fileName = "test.txt"
    val input = scala.io.StdIn.readLine("input content: ")

    val writer = new PrintWriter(new File(fileName))
    writer.write(input)
    writer.close
  }
}
