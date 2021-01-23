package c第三章_类和对象


open class ABC {
    companion object {//aa伴生对象只能由类调用，不能被继承，详见类的声明章节
        fun add(i: Int, j: Int) {
            println(i + j)
        }
    }
}


fun main() {
    var obg = object {
        val i = 10
        val j = 3
        fun add() = i + j
    }
    println(obg.add())
    println(obg.i)

    var obj = object :ABC(){    //匿名实现类
        val k = 666
    }
    println(obj.k)

}
