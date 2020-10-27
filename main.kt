fun main(){

    print("Enter your body temperature, should be between 92.0 and 104.0 ")
    var temp = readLine()!!.toInt()
    if(temp < 97.5){
        println("your temperature is low!")
    }
    else if(temp > 99.5){
        println("your temperature is high!")
    }
    else{
        println("your temperature is normal")
    }
}