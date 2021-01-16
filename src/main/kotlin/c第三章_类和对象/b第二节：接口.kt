package c第三章_类和对象

//接口可以通过实现类来实现，或者接口对象实现
interface A{
    fun close(str :String):String     //定义了一个接口 有一个抽象方法，所以它也是一个函数式接口
}

class Read:A {
    override fun close(str: String):String {
        println(str)//实现类必须实现接口中所有的的抽象方法
        return str
    }
}

class R{
    val name = "储存"
    companion object{//伴生对象内的方法只能通过类名.方法名 调用 R.a()
        fun a(){
            println("测试")
        }
    }

}

fun main() {
    val aa = object :A{         //object用于创建匿名实现对象
        override fun close(str: String): String {
            println(str)
            return str
        }
    }

    Read().close("匿名实现类对象")
    aa.close("匿名接口对象")



}