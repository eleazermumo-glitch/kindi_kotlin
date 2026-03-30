fun main(){
    try{
        val result=10/10
        println("Result: $result")
    }catch(e:ArithmeticException){
        println("Error:Can not divide by zero")

    }
}