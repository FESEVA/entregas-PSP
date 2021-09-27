fun main(){
   // var n:Int? = readLine()?.toInt()
    print("Introduzca un numero: ")
    var n:Int? = readLine()?.toIntOrNull()

     var nConversion:String = n.toString()
    println()
   println("El numero introducido es "+nConversion)

}