package c第三章_类和对象

private var a = 10//只在当前文件内可见
internal val b = 3 //在当前模块内可见
var aa = 35 //默认式public 全局可见

class Visible(name:String, age:Int, id:Int){
    val name = name
    private val id = id //只在当前类 内部可见
    var age = age

}
