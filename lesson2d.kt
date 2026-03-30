fun main(){
    //using logical operators in condtitional statements
    val marks=9
    if (marks>=0 && marks<=30){
        print("$marks marks is :Below Avearage")
    }else if(marks>30 && marks<=50){
        print("$marks marks is :Average")
    }else if(marks>50 && marks<=70){
        print("$marks marks is:Above avearge")
    }else if(marks >70 && marks<=100){
        print("$marks marks is :passed")
    }else{
        print("$marks marks is invalid...")
    }
}