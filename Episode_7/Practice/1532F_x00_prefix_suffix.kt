//
// Created by fme on 30/05/2022.
//

fun main(){
    val n = readLine()!!.toInt()
    val strings = MutableList(2*n-2){ readLine()!! }
    val stringsSorted = strings.withIndex().sortedBy{ (_, value) -> value.length }
    var (prefix, suffix) = stringsSorted.takeLast(2)
    if (prefix.value.substring(1) != suffix.value.substring(0, n-2))
        prefix = suffix.also { suffix = prefix }
    var swap = false
    val ansTmp = MutableList(2*n-2){'X'}
    stringsSorted.chunked(2).forEach{ (subPrefix, subSuffix) ->
        if (prefix.value.startsWith(subPrefix.value) && suffix.value.endsWith(subSuffix.value)) {
            ansTmp[subPrefix.index] = 'P'; ansTmp[subSuffix.index] = 'S'
        } else {
            ansTmp[subPrefix.index] = 'S'; ansTmp[subSuffix.index] = 'P'
            if (!(prefix.value.startsWith(subSuffix.value) && suffix.value.endsWith(subPrefix.value)))
                swap = true
        }
    }
    val ansFinal = ansTmp.fold(""){ transformed, char ->
        transformed + if (swap) {if (char=='P') 'S' else 'P'} else char
    }
    println(ansFinal)
}