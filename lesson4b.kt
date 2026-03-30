fun main(){
    sum()
    subtraction()
    multipilication()
    division()
    square()
    area()
}

fun sum(){
   val num1=6
   val num2=9
    val answer=num1+num2
    println("The sum of $num1 and $num2 id : $answer")

}
fun subtraction(){
    val num1=30
    val num2=10
    val answer=num1-num2
    println("The diffrence between $num1 and $num2 is : $answer")
}

fun multipilication(){
    val num1=2
    val num2=7
    val answer= num1*num2
    println("the Product of $num1 and $num2 is : $answer")
}


fun division(){
    val num1=40
    val num2=8
    val answer=num1/num2

    println("The Quotient of $num1 and $num2 is :$answer")
}


fun square(){
    val num=3
   val  answer=num*num
   println("the square of $num is :$answer")
   
}

fun area(){
    val b=5
    val h=8
    val answer=0.5*(b*h)
    println("The area of the traingle is $answer")
}