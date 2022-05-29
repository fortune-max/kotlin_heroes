fun main(){
    readLine()
    val ans = readLine()!!.split(" ").map(String::toInt).sorted().chunked(2).fold(0){ total, (smaller, bigger) ->
        total + (bigger - smaller)
    }
    println(ans)
}