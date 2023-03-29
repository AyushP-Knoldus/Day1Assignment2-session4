# Day1Assignment2-session4
## Problem Statement
In a list of numbers return the square root of all the numbers.  

Sample Input: List(4, 16, 25, 36)  
Sample Output List(2, 4, 5, 6)  
## Source Code
import scala.math.sqrt  

class SquareRoot {  
 
  def calculateSquareRoot(inputList: List[Int]): List[Int] = {  
    inputList.map { number =>  
      val numberSquareRoot = sqrt(number).toInt  
      if (numberSquareRoot > 0) {  
        numberSquareRoot  
      }  
      else {  
        -1  
      }  
    }  
  }  
}  
