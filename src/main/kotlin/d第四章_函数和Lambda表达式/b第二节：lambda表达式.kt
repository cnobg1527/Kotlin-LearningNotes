package d第四章_函数和Lambda表达式

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }//lambda表达式完整语法，=前面是参数类型和返回类型声明
val minus = { x: Int, y: Int -> x - y }//如果可以从结果推断出类型，可以省略类型声明


val add = { i: Int, str: String -> i + str.length }

/*
* 在函数参数中传递lambda掌握的不好后期需要多参考学习*/
fun put(p: () -> Unit):Int {
    return 8
}

fun main() {
    val list = mutableListOf(1, 33, 55, 77, 22, 8)
    val filter = list.filter { it <= 22 }
    println(filter)
    list.add(55)
    list.add(0, 67)
    println(list)

    println(add(3, "hello"))


    println(put { add(66, "hello") })

}
