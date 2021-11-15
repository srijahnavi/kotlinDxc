package basics

fun main(){
    println("sum of 19 and 23 is ${sum(19, 23)}")
    println("hello world")
    var sweety = Student("srijahnavi",123,768)
    var hari : Student = Student("nani",12,17)
    println(hari.name)
    println("max of 0 and 16 is ${maxOf(0,16)}")
 }
 fun sum(a:Int, b: Int)  = a+b
 fun maxOf(a: Int, b:Int) = if (a > b) a else b