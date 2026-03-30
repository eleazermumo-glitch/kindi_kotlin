fun main(){
    ///if...else if ...else
    //this allows testing of multiple cons=ditions. the one that will be  met first in order is the one whose whose subequent block of coe=de will be executed .the esle block is executed when all the condition have failed/false -its like a defalult block
    val number=-9
    if(number>0){
        print("$number is a positive number")
    }else if(number<0){
        print("$number is a negative number")
    }else{
        print("$number is  a zero number")
    }
}