package basics

class WhenExpr {
}
fun main() {
    foo(num = 30)
    //print(describe("hello"))
}

fun describe(obj: Any):String =
    when(obj){
        1 -> "one"
        "hello" -> "Greeting"
        else -> "a default"
    }

fun getStringLength(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` is automatically cast to `String` in this branch
    return obj.length
}

fun foo(num: Int = 0, name: String = "sweety") {
    println("the value of a is $num and name is $name")
}