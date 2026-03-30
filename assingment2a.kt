fun main(){
    val points=2000
    if(points<100){
        print("$points :You do not qualify")
    }else if(points>101 && points<=400){
        print("$points :You win a smartPhone")
    }else if(points>401 && points<=1000){
        print(" $points: You win a laptop")
    }else{
        print("$points :You win a trip to canada")
    }
}