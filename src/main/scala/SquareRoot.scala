package com.knoldus

import scala.math.sqrt

//
class SquareRoot {
  //Returns list with square root of elements
  def calculateSquareRoot(inputList: List[Int]): List[Int] = {
    inputList.map { number =>
      val numberSquareRoot = sqrt(number).toInt
      if (numberSquareRoot > 0) {
        numberSquareRoot
      }
      //If negative number is found then replace them with -1
      else {
        -1
      }
    }
  }
}
