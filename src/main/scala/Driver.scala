package com.knoldus
/*The driver object is created to call the calculateSquareRoot method to return list with square root of elements
*                                                                                                -Ayush Pathak */
object Driver {
  def main(args: Array[String]): Unit = {
    val squareRootObject = new SquareRoot
    val list = List(4, 16, 25, 36)
    println(squareRootObject.calculateSquareRoot(list))
  }
}