//inhetitance -this is where the child class inhetits the functions and propreties of parent class
//filefor the inhertiance to happen we use the keyword open in the parent class
// so the childclass will have both its own function and propreties and its parents class
 open class Animal{
    //function 
    fun eat(){
        println("This animal eats food")
    }
 }

 class Dog:Animal(){
    fun  bark(){
        println("The dog barks")
    }
 }

 fun main(){
    //Object-class instance
    val dogObject=Dog()
    dogObject.bark() //from class dog
    dogObject.eat() //from the parent class animal
 }