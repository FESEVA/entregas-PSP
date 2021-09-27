fun main(){

    val a = 171
    val b = 3

    println("a and b = ${a and b}")
    //AND = 00000011 - 3
    println("a xor b = ${a or b}")
    //OR  = 10101011 - 171
    println("a or b = ${a xor b}")
    //XOR  = 00101010 - 168
    println("a shl 3 = ${a shl 3}")
    //shl = 01011000 - 1368
    println("a shr 2 = ${a shr 2}")
    //shr = 00101010 - 42
}
