@file:Suppress("NO_TAIL_CALLS_FOUND")

package d第四章_函数和Lambda表达式

import java.util.Arrays.asList

class Wall(var size:Int){
    fun size():Int = size   //表达式函数 成员函数

    infix fun mirror(str:String):String{    //中缀函数必须只有一个参数 必须是成员函数 或者扩展函数 常见于数字移位或坐标移位
        //如果中缀函数的使用不利于 代码阅读 建议使用普通函数
        assert(str.isEmpty() || str == " ")
        return str.reversed() + size()
    }
}

fun bottle(volume: Int = 0):Int? { //全局函数 并且参数带有默认值
    return if (volume > 0) volume*volume else null
}

/*
* 闭包函数拥有与原函数一样的函数名，并且增加不同的参数实现了原有函数的功能扩展
*/
fun glass(vararg str:String): String? {          //这是一个闭包函数，同时它具有可变参数数量
    fun glass(s:String): String? {
        return if (s.length >= 5) s else null
    }
    println(str[1].reversed())
    return glass(str[0])
}

tailrec fun add(num:Int):Int{   //尾部递归可以防止栈溢出
    return if (num <= 1) num else add(num - 1) + num

}

fun <T> singletonList(item: T) { /*...*/ } //泛型函数可以在任意位置声明


fun main() {
    println(glass("hello world","闭包函数"))    //如果函数用到了第二个参数 就必须给参数 不然包错
    println(bottle(9))
    var obg = Wall(77)
    println(obg.size)
    println(obg mirror "  hello")   //中缀函数 代替了点操作符，某些时候使代码不易阅读
    println(add(1050))
    val a = arrayOf(1, 2, 3)
    val list = listOf(-1, 0, *a, 4)
    println(list)



}

