fun main() {
    repeat(readLine()!!.toInt()){
        val(n, i) = readLine()!!.split(" ").map(String::toInt)
        var ans = String()
        repeat(i){
            ans += (97+it).toChar().toString().repeat(n/i)
        }
        ans += (96+i).toChar().toString().repeat(n%i)
        println(ans)
    }
}