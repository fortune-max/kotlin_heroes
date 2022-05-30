//
// Created by fme on 30/05/2022.
//

fun main(){
    repeat(readLine()!!.toInt()){
        val (n, k) = readLine()!!.split(" ").map(String::toInt)
        var ans = 0
        repeat(n){
            val (l, r) = readLine()!!.split(" ").map(String::toInt)
            if (l <= k)
                ans = maxOf(ans, maxOf(r - k + 1, 0))
        }
        println(ans)
    }
}