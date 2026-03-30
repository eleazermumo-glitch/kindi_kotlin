fun main(){
    addition(6,9)
    subtraction(40,10)
    multipilication(5,9)
    division(40,8)
}

fun addition(num1:Int,num2:Int){
    val answer=num1+num2
    println("THe sum of $num1 and $num2 is $answer")
}

fun subtraction(num1:Int,num2:Int){
    val answer=num1-num2
    println("The diffrence between $num1 and $num2 is $answer")
}

fun multipilication(n1:Int,n2:Int){
    val answer=n1*n2
    println("The product between $n1 and $n2 is $answer")

}

fun division(number1:Int,number2:Int){
    val answer=number1/number2
    println("The quotient between $number1 and $number2 is $answer")
}

