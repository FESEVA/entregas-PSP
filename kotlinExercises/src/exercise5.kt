fun main(){

    val a = 10
    val b = 9
    val c = a%b
    val d = (c+1)/2

    println("a. ${!((a > b) && (c == d))}")
    // a. !(true && true) = false
    println("b. ${(a > b) && (c != d)}")
    // b. (true && false) = false
    println("c. ${!(a != (b+1))}")
    // c.        !(false) = true
    println("d. ${((a * b) % 2) > ((c+1) / 2)}")
    // d.         (false) = false
}