fun main(){
    readLine()
    val nums = readLine()!!.split(" ").map(String::toLong)
    val maxIndexes = nums.withIndex().sortedByDescending { it.value }.take(2)
    val totalSum = nums.sum()
    val goodIndexes = mutableListOf<Int>()
    nums.forEachIndexed{ index, value ->
        val remaining = totalSum - value;
        val maxElem = if (index != maxIndexes.first().index) maxIndexes.first().value else maxIndexes.last().value
        if (maxElem * 2 == remaining) goodIndexes.add(index + 1)
    }
    println(goodIndexes.count())
    println(goodIndexes.joinToString(" "))
}