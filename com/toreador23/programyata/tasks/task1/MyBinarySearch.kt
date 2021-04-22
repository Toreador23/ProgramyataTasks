package com.toreador23.programyata.tasks.task1

fun main (args: Array<String>) {
    val inputList = readLine()!!.split(' ').map(String::toInt)
    val listSorted = inputList.sorted()
    println("$listSorted")
    val item = readLine()!!.toInt()
    var low = 0
    var high = listSorted.size -1
    var isItemFound = false
    while(low<=high) {
        val mid = (low+high)/2
        val guess = listSorted[mid]
        when {
            guess == item -> {
                println("$mid")
                isItemFound = true
            }
            guess > item -> high = mid-1
            else -> low = mid +1
        }
        if (isItemFound) break
    }
    if (!isItemFound) {
        println("Your number wasn't found")
    }
}