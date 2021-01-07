package b第二章_基础知识

import java.io.IOException

fun main1() {
    var b: Byte = 1      //需要显式声明

    var s: Short = 3     //需要显示声明

    var i: Int = 1      //类型推断默认
    var i1 = 2

    var l: Long = 1  //显式声明
    var l1 = 2L     //自动推断

    var f: Float = 1.1F     //即使显示声明也需要F，f后缀
    var f2 = 2.2F

    var d: Double = 2.3      //默认
    var d1 = 2.4

    var test1 = b + s     //默认支持类型提升
    var test2 = b + i + f
    var test3 = s + f
    var test4 = f + d

    var test5 = b.toUByte() + l.toUByte()//然鹅test5的结果却是int

    var test6 = l.toByte()  //可以通过to方法，将一个数转为任何类型的数

    //var test7 :Byte = b + l.toByte() 错误的写法
    var test8 = (b + l).toByte()       //先运行再转换

    //定义字符
    var c = 'c'

}

fun main2() {
    //运算
    var a = 5
    var b = 8.6

    println("小数/整数  ${b / 2}")   //任何数与小数运算 结果为小数
    println("整数/小数  ${a / 2.5}")
    println("整数/整数  ${a / 2}")    //自动丢掉余数
    println("小数%整数  ${b % 2}")
    println("整数%小数  ${a % 2}")

    println("***************************")
    var c = 1
    if (c++ < 3 && ++c != 2) println("c现在的值为 $c")

    println("***************************")

    //数组
    var arr = arrayOf(1,2,3,4,5)    //创建可变数组
    var newarr = arr.drop(arr.size)      //drop意为丢掉前面几个  返回新的数组  原数组不变
    //newarr[0] = 7                     数组长度为0时，不能添加内容 arrayof定义的数组，长度在赋值时即固定
    println(newarr)
    arr.set(0,33)
    arr.forEach { if (it != arr.last()) print("$it ") else println(it)}
    println(arr.last())

    var nulls = arrayOfNulls<String>(9)//创建长度9的 没有值的 空数组
    nulls[3] = "我"
    "I love you".also { nulls[3] = it }
    println(nulls[3])

    Array(4){1}//原始数组，无需装箱开销
        .forEach { println(it)  }

}

//字符串练习
fun main() {
    //字符串的方法太多，没办法一一测试，有空多练习 多看即可
    var text = "  --I Love You__  IIIII"
    println("去除前导空格： ${text.trim()}")
    println("返回字符长度： ${text.length}")
    println("返回索引值： ${text.get(9)}")
    println("返回索引5的字符： ${text[6]}")
    println("丢弃前4个字符： ${text.drop(4)}")
    println("反转字符； ${text.reversed()}")
    println("替换所有出现的I： ${text.replace('I','H')}")
    text = "  --I Love You__  IIIII"
    println("移除某个范围的字符： ${text.removeRange(0,5)}")
    println("判断是否以某个字符开头： ${text.startsWith("i")}")
    println("判断以某个字符结尾： ${text.endsWith("i")}")
    println("消除前缀字符并判断： ${text.trimMargin(" -").toUpperCase().endsWith("I")}")
    println("转换为整数： ${text.toIntOrNull()}")
    println("转换为字符数组： ${text.toCharArray()
        .forEach { print(it) }}")


}