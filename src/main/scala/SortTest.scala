import java.util

import scala.annotation.tailrec
// ldelamotte17@georgefox.edu
// Assignment 8
// 2019-04-26

class SortTest {

  object quicksort {

    def quickSortRecursive(values:Array[Int]) = {

      recursiveQuickSort(values, 0, values.length - 1)

    }

    def quickSort(values:Array[Int]) = {

    }

    def insertionSort(values:Array[Int]) = {

    }

    /** performs quick sort given an array of values */
    def recursiveQuickSort(values:Array[Int], low:Int, high:Int){

      val index = partition(values, low, high)

      if (low < index - 1) {
        recursiveQuickSort(values, low, index - 1)
      }

      if (high > index) {
        recursiveQuickSort(values, index, high)
      }

    }

    /** divides the array at a pivot point where the left side contains elements
    less than the pivot and the right side contains elements higher than the pivot */
    def partition(values:Array[Int], low:Int, high:Int):Int = {

      val pivot = values(high)
      var i = low - 1

      // goes through the array and swaps all elements smaller than the pivot
      for (j <- low until high) {
        if (values(j) <= pivot) {
          i += 1
          val temp = values(i)
          values(i) = values(j)
          values(j) = temp
        }
      }

      val temp = values(i + 1)
      values(i + 1) = values(high)
      values(high) = temp
      i + 1

    }
  }
}


