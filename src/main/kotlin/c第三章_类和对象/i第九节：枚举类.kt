package c第三章_类和对象

enum class Day(val rgb: Int,val big:String) {//创建枚举类并初始属性字段
    RED(0xff0000,"红色"),
    GREEN(0x00ff00,"绿色"),
    BLUE(0x0000fe,"蓝色")
}

fun main() {
    //println(Day.valueOf("RED"))//用作判断该枚举类是否有 指定常量
    //println(Day.RED.rgb)
    //println(Day.BLUE.big)
    Day.values().map { println(it.rgb.toString() +"  " + it.big) }

}