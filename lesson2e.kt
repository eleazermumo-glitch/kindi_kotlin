fun main(){
    //when is like a switch statement in other langauges
    //when tests multiple conditions
    
    //sythanx
    //when(expression)
    //{
    //         acse1->code to execute
                           //case2 ->code to execute
                           //else->code to execute if no matching cases}
    val marks=80

    when(marks){
        in 1..30->print(" $marks :Below average")
        in 31..50->print(" $marks: Average")
        in 51..70->print("$marks :Above avearge")
        in 70..100->print("$marks: Passed")
        else ->print("invalid marks")
    
    }
}