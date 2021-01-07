package b第二章_基础知识


//以下函数不需要指定返回类型，如果指定 反而会包错
fun foo1() {
    listOf<Int>(1,2,3,4,5).forEach stop@{
        if (it == 4) return@stop            //使用显式标签更方便，该标签由作者任意指定
        println(it) //当循环至4的时候后，把4返回给函数，继续下面的循环
    }
}

fun foo2() {
    listOf<Int>(1,2,3,4,5).forEach {
        if (it == 4) return@forEach     //使用隐式标签更方便：此类标签的名称与 lambda 传递到的函数的名称相同。
        println(it) //和上面的执行结果一样，只不过调用的是隐式标签，标签名为该lambda表达式名
    }
}

fun foo3(){
    run flag@{
        listOf<Int>(1,2,3,4,5).forEach {
            if (it == 4) return@flag
            println(it)     //这次的结果和上面是不一样的，该标签直接结束了一个代码块，所以最后的4.5都不会打印
        }
    }
}

fun main() {
    var v1 = foo1()
    println("foo1的返回值是: $v1")
    println("*********************************************")
    var v2 = foo2()
    println("foo2的返回值是: $v2")
    println("*********************************************")
    var v3 = foo3()
    println("foo3的返回值是: $v3")
    println("*********************************************")

    //利用自定义标记结束循环
    flag@ for (i in 1..9){              //99乘法表
        stop@ for (j in 1..9){
            if (j == i){
                println("$j x $i = ${i*j}")
                break@stop  //当然默认也是结束这层循环
            } else print("$j x $i = ${i*j}  ")
        }
    }

    println("*********************************************")




}