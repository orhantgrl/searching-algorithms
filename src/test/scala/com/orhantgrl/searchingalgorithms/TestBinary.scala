package com.orhantgrl.searchingalgorithms

import org.scalatest.BeforeAndAfter
import org.scalatest.flatspec.AnyFlatSpec

/**
 * @author orhangrl
 *         created on 7/9/20, Thu
 */

class TestBinary extends AnyFlatSpec with BeforeAndAfter {
  var array: Array[Int] = _

  before {
    // 13, 45, 66, 77, 88, 24, 76, 1, 2, 35, 26
    // 1 2 13 24 26 35 45 66 76 77 88 sorted
    array = Utils.readIntegerDataSet("assets/dataset.txt")
  }

  "Test for binary search" should "find correct, element index" in {
    val elementIndex = Binary.search(array = array, isSorted = false, lookingFor = 76)
    assert(elementIndex == 8)
  }

  it should "throw NoSuchElementException if result is -1" in {
    assertThrows[NoSuchElementException] {
      val elementIndex = Binary.search(array = array, isSorted = false, lookingFor = 120)
      if (elementIndex == -1) {
        throw new NoSuchElementException("It's alive!")
      }
    }
  }
}
