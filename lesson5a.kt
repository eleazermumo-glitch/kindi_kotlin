//OOP- this is a style of writting programms around objects
//we make real world objects to objects
//an object has propertites/characteriticts/stste/fetures/attributes and behaviuor/method/action/function 
//and object is an instace of a class
//a  class is like a blueprint/desing of wht the object should have ie state and behavour

//we use key word class to declare a class follwed by the classname
//in summarry a class is just a named group of variables and functions wraped and given a name and for you to access those members function/variables you have to use the object from that class

class person{
    //propreties /state
    val name="John"
    val age=34

    //mehods/functions/behaviuor

    fun speak(){
        println("A person $name can speak")
    }
    fun eat(){
        println(" A person $name can eat")
    }
    
    
}
fun main(){
    //create an  object-instance of a class
    val myObject=person()
    //accessing members function and states
    myObject.speak()
    myObject.eat()
    myObject.age
    println(myObject.age)
    



}