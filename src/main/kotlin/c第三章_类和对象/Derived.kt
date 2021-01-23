package c第三章_类和对象

interface Kiss {
    fun printMessage()
    fun printMessageLine()
}

class BaseImpl(val x: Int) : Kiss {
    override fun printMessage() {
        println(x)
    }

    override fun printMessageLine() {
        println(x)
    }
}

class Der(b: Kiss) : Kiss by b {
    override fun printMessage() {
        println("abc")
    }
}

fun main() {
    val b = BaseImpl(10)
    Der(b).printMessage()
    Der(b).printMessageLine()

    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }

    println(lazyValue)
    println(lazyValue)


}