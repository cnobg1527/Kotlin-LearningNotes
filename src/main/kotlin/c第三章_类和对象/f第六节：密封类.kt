package c第三章_类和对象

sealed class Fuck{//声明一个密封类，并且声明了一个抽象方法
    abstract fun fuck()
}
data class Num(var key:String,var value: Any):Fuck() {//任何类都可以继承密封类
    override fun fuck() {
        println("Num.fuck ")
    }
}

object CC:Fuck(){       //匿名实现对象？
    override fun fuck() {
        println("CC.fuck")
    }
}

fun main() {
    val fuck = Num("chen",88)//创建子类实例调用 实现的密封类方法
    fuck.fuck()
    CC.fuck()



}