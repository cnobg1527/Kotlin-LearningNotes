package a第一章_粗略了解

fun main() {
    //if , else if, else的判断语句，必要时最好用when
    println("输入一个数字")
    var a = readLine()?.toInt()
    if (a!! > 20) println("大于20")
    else if (a!! > 10) println("在10-20之间")
    else if (a!! > 0) println("很小")
    else println("未知数")

    //for循环
    val items = listOf("apple", "banana", "kiwifruit")//val定义的普通列表不能被修改，除非改为可变列表MultipleListOf
    //不能执行下面的重新赋值语句
    //items[1] = "orange"
    for (index in items.indices) {
        println("索引为${index}的元素值为${items[index]}") //如需不加大括号，则需要空格
    }

    //while循环
    var str = "apple"
    var index = 0
    while (index < str.length){
        println("索引$index 处的字母为${str[index]}") //如需不加大括号，则需要空格
        index++
    }

    //when语句
    print("请输入一个数字")
    var num = readLine()?.toInt()
    when(num){
        1,2,3,4 -> println("你刚才输入的是hello")  //多个条件可用逗号隔开
        5 -> println("你刚才输入的是$num")
        6 -> println("你刚才输入的是$num")
        7 -> println("你刚才输入的是$num")
        8 -> println("你刚才输入的是$num")
        else -> "请输入数字"
    }

    //范围
    var range = 10
    for (i in range..20) print("$i ,")          //将输出10-20 包括20
    print("\n")
    for (i in range until 20 ) print("$i ,")    //将输出10-19 不包括20
    print("\n")
    for (i in 1..10 step 2) print("$i ,")       //输出1-10 步长为2
    print("\n")
    for (i in 9 downTo 1) print("$i ,")         //输出9-1
    print("\n")
    for (i in 9 downTo 1 step 3) print("$i ,")  //输出9-1 步长为3
    print("\n")

    //函数调用
    for (i in items){       //上面定义过的列表
        val fruit = findFruit(i)
        println(fruit)
    }

    println("***********************************************")
    //lambda表达式 及链式调用方法
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
    .filter { it.startsWith("a") }//先过滤出a开头的名称
    .sortedBy { it }                    //再排序
    .map { it.toUpperCase() }           //再转换为大写
    .forEach { println(it) }            //输出

}
fun findFruit(fruitName:String):String {
    return when (fruitName) {
        "apple" ->  "苹果"
        "orange" ->  "橘子"
        "kiwifruit" ->  "猕猴桃"
        else -> "没有这种水果"
    }
}