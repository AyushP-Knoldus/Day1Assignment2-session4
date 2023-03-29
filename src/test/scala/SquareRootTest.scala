package com.knoldus

import org.scalatest.funsuite.AnyFunSuiteLike

class SquareRootTest extends AnyFunSuiteLike {
  val squareRootObject = new SquareRoot
  test("calculateSquareRoot method should return the modified list with square root of elements") {
    val list = List(81, 225, 64)
    val result = squareRootObject.calculateSquareRoot(list)
    assert(result == List(9, 15, 8))
  }
  test("calculateSquareRoot method should return -1 if list contain elements with negative numbers") {
    val list = List(-2, -5, 64, 81)
    val result = squareRootObject.calculateSquareRoot(list)
    assert(result == List(-1, -1, 8, 9))
  }
}
