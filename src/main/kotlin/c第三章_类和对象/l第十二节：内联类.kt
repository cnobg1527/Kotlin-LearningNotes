package c第三章_类和对象

interface Run {
    fun run()
}

class Cat : Run {
    fun show() {
        println("我是一只猫")
    }

    override fun run() {
        println("快跑不然要被捉住")
    }
}

class Mouse(run: Run) : Run by run{
    fun show(){
        println("我是一只老鼠")
    }
}

fun main() {
    val r = Cat()
    Mouse(r).run()
    Mouse(r).show()//它会调用自己实现的show方法

}