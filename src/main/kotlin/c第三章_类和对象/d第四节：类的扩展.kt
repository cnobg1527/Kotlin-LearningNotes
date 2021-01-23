package c第三章_类和对象

import kotlin.math.E

class Extend{
    var index = 0
    fun call(){
        println("this in call method")
    }
    companion object{
    }
}

fun Extend.show(){
    println("这是一个扩展方法") //原有类并无此方法，通过kotlin的特性，为原有类扩展了一个方法
}

fun Extend.Companion.show(){
    println("为当前类扩展一个伴生方法")//伴生方法companion
}

fun Extend.call(str:String){    //如果采用传入参数的方法，就会调用这个重载的方法
    println(str)
}




//以下main方法主要考虑这几个类都扩展了那些方法 重写了什么方法，类中可使用什么方法
open class Base {
    open fun printMessage() {}
    open fun printMessageLine() {}
}

class Derived : Base() { }

open class BaseCaller {
    open fun Base.printFunctionInfo() {
        println("在BaseCaller中，为Base类扩展了打印方法")
    }

    open fun Derived.printFunctionInfo() {
        println("在BaseCaller中，为Derived类扩展了打印方法r")
    }

    fun call(b: Base) {
        b.printFunctionInfo()   // call the extension function
    }
}

class DerivedCaller: BaseCaller() {//这个类重写了父类的方法，同时继承了call方法，但传入的式derived对象，此时对象自动转型为base对象
                                    //并调用call方法
    override fun Base.printFunctionInfo() {
        println("继承BaseCaller类，重写了Base的打印方法")
    }

    override fun Derived.printFunctionInfo() {
        println("继承BaseCaller类，重写了Derived的打印方法")
    }
}

fun main() {
    BaseCaller().call(Base())   // 在BaseCaller中，为Base类扩展了打印方法
    DerivedCaller().call(Base())  // 继承BaseCaller类，重写了Base的打印方法
    DerivedCaller().call(Derived())  // 继承BaseCaller类，重写了Base的打印方法，这里既有Derived对象的向上转型，又有多态的体现
}