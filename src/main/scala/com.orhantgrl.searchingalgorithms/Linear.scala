package com.orhantgrl.searchingalgorithms

/**
 * @author orhangrl
 *         created on 7/9/20, Thu
 */

object Linear {
  /**
   * @note Worst case O(n)
   * @param lookingFor value to look for in the array
   * @return If the element you are looking for is in the array, will return index of element. Else return -1
   */
  def search(array: Array[Int], lookingFor: Int): Int = {
    for (i <- array.indices) {
      if(array(i) == lookingFor) {
        return i
      }
    }
    -1
  }
}
