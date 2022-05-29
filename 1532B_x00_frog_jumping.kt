fun main() {
    repeat(readLine()!!.toInt()){
        val (a, b, k) = readLine()!!.split(" ").map{x -> x.toLong()}
        val ans = ((k+1)/2 * a) - (k/2 * b);
        println(ans)
    }
}