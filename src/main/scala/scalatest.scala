import quicksort.quicksort

import scala.util.Random

class scalatest {
  def main(args: Array[String]): Unit = {

    val random = new Random
    var currentTime = System.currentTimeMillis()
    var total = 0.toLong

    val values10000 = new Array[Int](10000)
    val values20000 = new Array[Int](20000)
    val values40000 = new Array[Int](40000)


    /** runs scala sort over array length 10000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 10000) {
        values10000(i) = random.nextInt(10000)
      }

      val scalaSort10000 = values10000.clone()
      currentTime = System.currentTimeMillis()
      val result = scalaSort10000.sortWith(_ < _)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("scala quicksort array length 10000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong

    /** runs recursive quick sort over array length 10000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 10000) {
        values10000(i) = random.nextInt(10000)
      }

      val quickSortRecursive10000 = values10000.clone()
      currentTime = System.currentTimeMillis()
      quicksort.quickSortRecursive(quickSortRecursive10000)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("recursive quick sort array length 10000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong

    /** runs quick sort over array length 10000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 10000) {
        values10000(i) = random.nextInt(10000)
      }

      val quickSort10000 = values10000.clone()
      currentTime = System.currentTimeMillis()
      quicksort.quickSortRecursive(quickSort10000)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("quick sort array length 10000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong

    /** runs insertion sort over array length 10000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 10000) {
        values10000(i) = random.nextInt(10000)
      }

      val itsertionSort10000 = values10000.clone()
      currentTime = System.currentTimeMillis()
      quicksort.insertionSort(itsertionSort10000)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("insertion sort array length 10000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong
    println("\n-------------------------------------------------------------\n")




    /** runs scala sort over array length 20000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 20000) {
        values20000(i) = random.nextInt(20000)
      }

      val scalaSort20000 = values20000.clone()
      currentTime = System.currentTimeMillis()
      val result = scalaSort20000.sortWith(_ < _)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("scala quicksort array length 20000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong

    /** runs recursive quick sort over array length 20000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 20000) {
        values20000(i) = random.nextInt(20000)
      }

      val quickSortRecursive20000 = values20000.clone()
      currentTime = System.currentTimeMillis()
      quicksort.quickSortRecursive(quickSortRecursive20000)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("recursive quick sort array length 20000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong

    /** runs quick sort over array length 20000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 20000) {
        values20000(i) = random.nextInt(20000)
      }

      val quickSort20000 = values20000.clone()
      currentTime = System.currentTimeMillis()
      quicksort.quickSortRecursive(quickSort20000)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("quick sort array length 20000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong

    /** runs insertion sort over array length 20000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 20000) {
        values20000(i) = random.nextInt(20000)
      }

      val itsertionSort20000 = values20000.clone()
      currentTime = System.currentTimeMillis()
      quicksort.insertionSort(itsertionSort20000)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("insertion sort array length 20000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong
    println("\n-------------------------------------------------------------\n")





    /** runs scala sort over array length 40000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 40000) {
        values40000(i) = random.nextInt(40000)
      }

      val scalaSort40000 = values40000.clone()
      currentTime = System.currentTimeMillis()
      val result = scalaSort40000.sortWith(_ < _)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("scala quicksort array length 40000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong

    /** runs recursive quick sort over array length 40000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 40000) {
        values40000(i) = random.nextInt(40000)
      }

      val quickSortRecursive40000 = values40000.clone()
      currentTime = System.currentTimeMillis()
      quicksort.quickSortRecursive(quickSortRecursive40000)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("recursive quick sort array length 40000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong

    /** runs quick sort over array length 40000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 40000) {
        values40000(i) = random.nextInt(40000)
      }

      val quickSort40000 = values40000.clone()
      currentTime = System.currentTimeMillis()
      quicksort.quickSortRecursive(quickSort40000)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("quick sort array length 40000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong

    /** runs insertion sort over array length 40000 */
    for (i <- 0 until 1000) {

      for (i <- 0 until 40000) {
        values40000(i) = random.nextInt(40000)
      }

      val itsertionSort40000 = values40000.clone()
      currentTime = System.currentTimeMillis()
      quicksort.insertionSort(itsertionSort40000)
      total += (System.currentTimeMillis() - currentTime)

    }
    println("insertion sort array length 40000, total time over 1000 runs: " + total / 1000)
    total = 0.toLong
    println("\n-------------------------------------------------------------\n")

  }
}
