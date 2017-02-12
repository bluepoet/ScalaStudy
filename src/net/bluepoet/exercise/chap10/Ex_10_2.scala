package net.bluepoet.exercise.chap10

/**
  * Created by Mac on 2017. 2. 12..
  */
object Ex_10_2 {
  def calcBallCount(ballList: Seq[Int], inputList: Seq[Int]): BallCount = {
    var strikes = 0
    var balls = 0

    for {
      (ball, indexBall) <- ballList.zipWithIndex;
      (input, indexInput) <- inputList.zipWithIndex
    } {
      if ((ball, indexBall) ==(input, indexInput)) strikes = strikes + 1
      else if (ball == input) balls = balls + 1
    }
    BallCount(strikes, balls)
  }

  case class BallCount(strikes: Int, Balls: Int)

}
