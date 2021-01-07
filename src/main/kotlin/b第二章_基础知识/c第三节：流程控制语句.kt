package b第二章_基础知识

fun main() {
    var a = 3
    var b = 3
    //练习if语句
    /*var c = if (a > b) {
        println(a)
        a               //条件满足会把a的值 赋值给c
    } else if (a < b) {
        println(b)
        b
    } else {
        println("不知道")
        404
    }
    println("c的返回值为$c")*/

    var c = if (a > b) a else if (a < b) b else 404
    println("c的返回值为$c")

    //练习when
    println("请输入单个字母或数字")
    var input = readLine()?.get(0)
    when (input) {
        in '0'..'9' -> println("输入的是数字:$input")
        in 'a'..'z' -> println("输入的是字母：$input")
        else -> println("不知道输入的啥")
    }
    println(input?.toInt())

    println("*****************************************************")

    //for循环练习
    var arr = intArrayOf(1, 33, 4, 54, 6, 78, 5)
    for (index in arr.indices) println("索引$index 的值为${arr[index]}")

    println("*****************************************************")

    //while练习
    while (true) {
        var x = readLine()?.toIntOrNull()
        when (x) {
            in 0..34 -> println("太小了")
            in 36..100 -> println("太大了")
            35 -> {
                println("猜对了")
                break
            }
            else -> println("输入有误")
        }
    }
    println("*****************************************************")

    //do while练习
    do{
        println("先执行一次再说")
    }while (false)
    println("*****************************************************")

    //with练习
    with(arr){
        println("数组的长度为 $size") //不用输arr.size 直接输size即可，把对对象的操作放在代码块中
        println("获取某个元素：${get(4)}")
    }
    println("*****************************************************")

    //run练习
    run { for (i in 1..10) print(i)
    }
}

