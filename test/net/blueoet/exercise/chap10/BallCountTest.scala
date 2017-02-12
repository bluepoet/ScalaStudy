package net.blueoet.exercise.chap10

import net.bluepoet.exercise.chap10.Ex_10_2._
import org.scalatest.FlatSpec

/**
  * Created by Mac on 2017. 2. 12..
  */
class BallCountTest extends FlatSpec {
  "3 numbers all not match" should "3 out!!" in {
    assert(calcBallCount(Seq(1,2,3), Seq(4,5,6)) == BallCount(0, 0))
    assert(calcBallCount(Seq(1,2,3), Seq(1,5,6)) == BallCount(1, 0))
    assert(calcBallCount(Seq(1,2,3), Seq(0,5,2)) == BallCount(0, 1))
    assert(calcBallCount(Seq(1,2,3), Seq(1,3,9)) == BallCount(1, 1))
    assert(calcBallCount(Seq(1,2,3), Seq(1,3,2)) == BallCount(1, 2))
    assert(calcBallCount(Seq(1,2,3), Seq(1,2,9)) == BallCount(2, 0))
    assert(calcBallCount(Seq(1,2,3), Seq(1,2,3)) == BallCount(3, 0))
  }
}
