package com.orhantgrl.searchingalgorithms

/**
 * @author orhangrl
 *         created on 7/9/20, Thu
 */
object Binary {

  /**
   * @note im fucking confused right here. Is scala pass by value or reference?
   * @note sorted array, will be good for time complexity. Worst case O(log(n))
   * @param array if array not sorted. This will be sort array
   * @param lookingFor value to look for in the array
   * @param isSorted default is false but if you sure is array sorted just set it true
   * @return If the element you are looking for is in the array, will return index of element. Else return -1
   */
  def search(array: Array[Int], isSorted: Boolean, lookingFor: Int): Int = {
    if (!isSorted) bubbleSort(array)

    var maxBound = array.length
    var minBound = -1

    while (maxBound - minBound > 1) {
      val point = (maxBound + minBound) / 2
      if (array(point) == lookingFor) {
        return point
      } else if (array(point) < lookingFor) {
        minBound = point
      } else {
        maxBound = point
      }
    }
    -1
  }

  def bubbleSort(array: Array[Int]): Unit = {
    for (i <- array.indices) {
      for (j <- 0 until array.length - i - 1) {
        if(array(j) > array(j+1)) {
          val temp = array(j)
          array(j) = array(j+1)
          array(j+1) = temp
        }
      }
    }
  }
}
