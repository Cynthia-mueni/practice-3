fun main(args: Array<String>) {
   name("Cynthia","pearl","Agness","Nancy")
    number()
    isEven(5)
    println(name("Cynthia"))
}
fun name(name1:String,name2:String,name3:String,name4:String){
    var nameArray=arrayOf(name1,name2,name3,name4)
    println(nameArray.contentToString())
}
fun number(){
    var number=arrayOf(32,174,78,43,90,31,3,73,11,158,62)
    println(number.indexOf(158))
     var a=number[1]
    var b=number[4]
    var sum=a+b
    println(sum)

    var rearrange=number.sort()
    println(rearrange)
}
fun isEven(num:Int):Boolean{
    if(num % 2 ==0){
        println("Even")
        return true
    }
    else{println("odd")
        return false}
}
fun name(word:String):Int{
    var text = word.length
    return text
}

