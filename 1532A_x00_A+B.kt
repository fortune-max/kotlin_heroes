fun main(){
    val n = readLine()!!.toInt()
    (1..n).forEach{ _ ->
        val (a, b) = readLine()!!.split(" ")!!.map{x -> x.toInt()}
        println(a + b)
    }
}
