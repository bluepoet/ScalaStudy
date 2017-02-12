package net.bluepoet.exercise.chap10

import Ex_10_1.convertInputs
import Ex_10_2.{BallCount, calcBallCount}
import scala.io.StdIn.readLine

import scala.util.Random

/**
  * Created by Mac on 2017. 2. 12..
  */
object Ex_10_3 {
  def main(args: Array[String]) {
    println("start number baseball game!")
    val ballList = Random.shuffle(0 to 9).drop(7)

    while (true) {
      print("input numbers :")
      val inputList = convertInputs(readLine())
      println(inputList)
      if(inputList != None) {
        val ballCount = calcBallCount(ballList.toSeq, inputList.get)

        ballCount match {
          case BallCount(0, 0) => println("out!!")
          case BallCount(3, 0) => println("3 strikes!!"); System.exit(0)
          case BallCount(strike, 0) => println(s"$strike 스트라이크!")
          case BallCount(0, ball) => println(s"$ballCount 볼!")
          case BallCount(strike, ball) => println(s"$strike 스트라이크 $ball 볼!")
          case _ => println("error!")
        }
      }
    }
  }
}