package net.bluepoet.exercise.ext

import scala.util.Random

/**
  * Created by Mac on 2017. 1. 14..
  */
object RandomStudyMemberExtractor {
  def main(args: Array[String]) {
    var member = Array("poet.me", "seed.sim", "june.kim", "amy.k", "merry.mas", "perl.kang", "logan.lee")
    var randomNumbers = Random.shuffle(0 to 6).toList

    println(randomNumbers)

    for ((num, index) <- randomNumbers.zipWithIndex) {
      println(member(num))

      if (index == 2) return
    }
  }
}
