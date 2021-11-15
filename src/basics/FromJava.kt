package basics

object FromJava {
    @JvmStatic
    fun main(args: Array<String>) {
        val sweety = Student("sweety", 21, 994)
        println(sweety.name)
    }
}