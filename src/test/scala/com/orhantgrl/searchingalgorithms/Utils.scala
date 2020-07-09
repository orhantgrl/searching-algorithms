package com.orhantgrl.searchingalgorithms

import java.io.{FileNotFoundException, IOException}

import scala.io.Source

/**
 * @author orhangrl
 *         created on 7/9/20, Thu
 */
object Utils {
  def readIntegerDataSet(uri: String): Array[Int] = {
    var array: Array[Int] = null
    var bufferedReader: Source = null
    try {
      bufferedReader = Source.fromFile(uri)
      bufferedReader.getLines().foreach(line => {
        array = line.split(",").map(s => Integer.parseInt(s.trim))
      })
      array
    } catch {
      case fnfe: FileNotFoundException => println(fnfe.getMessage); array
      case ioe: IOException => println(ioe.getMessage); array
      case nfe: NumberFormatException => println(nfe.getMessage); array
    } finally {
      if (bufferedReader != null) {
        bufferedReader.close()
      }
    }
  }
}
