fun main(){
    var a:Int? = readLine()?.toInt()

    var b:Boolean = a?.rem(4)  == 0
    var c:Boolean = a?.rem(100) != 0
    var d:Boolean = a?.rem(400) == 0

    var respuesta:Boolean = b && c || d

    println(respuesta)
}