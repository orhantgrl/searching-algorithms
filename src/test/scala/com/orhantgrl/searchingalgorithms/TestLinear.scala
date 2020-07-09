package com.orhantgrl.searchingalgorithms

import org.scalatest.BeforeAndAfter
import org.scalatest.flatspec.AnyFlatSpec

/**
 * @author orhangrl
 *         created on 7/9/20, Thu
 */
class TestLinear extends AnyFlatSpec with BeforeAndAfter{
  var array: Array[Int] = _

  before {
    // 13, 45, 66, 77, 88, 24, 76, 1, 2, 35, 26
    array = Utils.readIntegerDataSet("assets/dataset.txt")
  }

  "Test for linear search" should "find correct, element index" in {
    val elementIndex = Linear.search(array = array, lookingFor = 26)
    assert(elementIndex == 10)
  }

  it should "throw NoSuchElementException if result is -1" in {
    assertThrows[NoSuchElementException] {
      val elementIndex = Linear.search(array = array, lookingFor = 3)
      if (elementIndex == -1) {
        throw new NoSuchElementException("It's alive!")
      }
    }
  }
}
