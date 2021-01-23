package c第三章_类和对象

class Outer{ //inner class
    val i = 100
    fun add() = println("250")
    inner class Inner{
        fun show(): Int {
            add()       //内部类可直接调用外部类的属性和方法，嵌套类不行
            return i
        }
    }
}

class Out{
    val j = 1
    class In{
        fun show() = Out().j//不能直接访问j的值，需要创建外部类的对象来访问
    }
}

fun main() {
    println(Outer().Inner().show())//内部类和嵌套类的调用方法是不一样的
    println(Out.In().show())//注意区分嵌套类和内部类的调用方法
}