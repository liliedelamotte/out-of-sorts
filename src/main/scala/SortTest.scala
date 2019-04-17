import scala.util.Random
// ldelamotte17@georgefox.edu
// Assignment 8
// 2019-04-26

class SortTest {

  object quicksort {

    /** performs quicksort with recursion given an array of values */
    def quickSortRecursive(values:Array[Int]){

      quickSortRecursiveLogic(values, 0, values.length - 1)

    }

    /** performs quicksort without recursion given an array of values */
    def quickSort(values:Array[Int]){

      var stack = Seq[(Int, Int)]()
      var low = 0
      var high = values.length - 1

      stack +:= (low, high)

      while (stack.nonEmpty) {
        low = stack.head._1
        high = stack.head._2
        stack = stack.tail

        val pivot = partition(values, low, high)

        if (pivot - 1 > low) {
          stack +:= (low, pivot - 1)
        }

        if (pivot +1 < high) {
          stack +:= (pivot + 1, high)
        }
      }
    }

    /** performs insertion sort given an array of values */
    def insertionSort(values:Array[Int]){

      // iterates through every element and moves
      // it until it is in the right place
      for (i <- 1 until values.length) {

        val key = values(i)
        var j = i - 1

        while (j >= 0 && key < values(j)) {
          values(j + 1) = values(j)
          j -= 1
        }

        values(j + 1) = key

      }
    }

    /** performs quick sort given an array of values */
    def quickSortRecursiveLogic(values:Array[Int], low:Int, high:Int){

      val index = partition(values, low, high)

      if (low < index - 1) {
        quickSortRecursiveLogic(values, low, index - 1)
      }

      if (high > index) {
        quickSortRecursiveLogic(values, index, high)
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

  def main(args: Array[String]): Unit = {

    val random = new Random
    var currentTime = System.currentTimeMillis()

    val values1000 = new Array[Int](1000)
    val values2000 = new Array[Int](2000)
    val values4000 = new Array[Int](4000)

    for (i <- 0 until 1000) {
      values1000(i) = random.nextInt(1000)
    }

    for (i <- 0 until 2000) {
      values2000(i) = random.nextInt(2000)
    }

    for (i <- 0 until 4000) {
      values4000(i) = random.nextInt(4000)
    }

    /* runs of length of 1000 */
    currentTime = System.currentTimeMillis()
    quicksort.quickSortRecursive(values1000.clone())
    println("quickSortRecursive on 1000 total time: " + (System.currentTimeMillis() - currentTime) / 1000 + "\n")

    currentTime = System.currentTimeMillis()
    quicksort.quickSort(values1000.clone())
    println("quickSort on 1000 total time: " + (System.currentTimeMillis() - currentTime) / 1000 + "\n")

    currentTime = System.currentTimeMillis()
    quicksort.insertionSort(values1000.clone())
    println("insertionSort on 1000 total time: " + (System.currentTimeMillis() - currentTime) / 1000 + "\n")
    println("-------------------------------------------------\n\n")


    /* runs on length of 2000 */
    currentTime = System.currentTimeMillis()
    quicksort.quickSortRecursive(values2000.clone())
    println("quickSortRecursive on 2000 total time: " + (System.currentTimeMillis() - currentTime) / 1000 + "\n")

    currentTime = System.currentTimeMillis()
    quicksort.quickSort(values2000.clone())
    println("quickSort on 2000 total time: " + (System.currentTimeMillis() - currentTime) / 1000 + "\n")

    currentTime = System.currentTimeMillis()
    quicksort.insertionSort(values2000.clone())
    println("insertionSort on 2000 total time: " + (System.currentTimeMillis() - currentTime) / 1000 + "\n")
    println("-------------------------------------------------\n\n")


    /* runs on length of 4000 */
    currentTime = System.currentTimeMillis()
    quicksort.quickSortRecursive(values4000.clone())
    println("quickSortRecursive on 4000 total time: " + (System.currentTimeMillis() - currentTime) / 1000 + "\n")

    currentTime = System.currentTimeMillis()
    quicksort.quickSort(values4000.clone())
    println("quickSort on 4000 total time: " + (System.currentTimeMillis() - currentTime) / 1000 + "\n")

    currentTime = System.currentTimeMillis()
    quicksort.insertionSort(values4000.clone())
    println("insertionSort on 4000 total time: " + (System.currentTimeMillis() - currentTime) / 1000 + "\n")
    println("-------------------------------------------------")


  }
}


