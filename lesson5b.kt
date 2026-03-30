class Square{
    //propreties
    val width=5.0
     val height=5.0

    //method/function
    fun calculate_area(){
        val area= width*height
        println("Area of a sqaure is : $area")

    }
    fun calculate_perimeter(){
        val perimeter=2*(width+height)
        println("The perimeter of the square is : $perimeter")
    }
}
fun main(){
    //craeting an instance of a class
    val myObject=Square()
    //accesing member function/state
    myObject.calculate_area()
    myObject.calculate_perimeter()

}