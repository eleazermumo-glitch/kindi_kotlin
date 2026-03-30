fun main(){
    numDecteor(9)
    mul(3,9)
    grading()



}
fun numDecteor(num:Int){
    if(num%2==0) {

        println("$num is even")
    }else{
        println("$num is odd")
    }
}

fun mul(n1:Int,n2:Int){
   for(n  in 0..n2){
        val answer=n1*n
        
        println("$n1* $n=$answer")

    }

fun grading(){
    val marks=arrayOf(20,50,60,70)
    var total=0
    var heighest=marks[0]
    var lowest=marks[0]
    for (mark in marks){
        total+=mark
            if(mark>heighest){
                heighest=mark
            }
            if(mark<lowest){
                lowest=mark
            }
            
        }
        println("The heightest mark is :$heighest")
        println("the lowest mark is :$lowest")
}    



}