fun main(){

    //function with parameters-they allow function to be reusable with diffret=nt valus
    //parameters act like variable inside the function body
    //you have to explicity define the data type of the parameter
    //argumebts/data/imformation will be prhraded during invoking the functiom
    sayHello("John")
    sayHello("Grace")
    
    sayWelcome("Najjeri")
}
fun sayHello(name:String){
    println("Hello $name")
}

fun sayWelcome(name:String){
    println("welcome to our inventory system $name")
    
}
