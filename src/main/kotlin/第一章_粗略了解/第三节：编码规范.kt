package 第一章_粗略了解

open class Human(val name:String, val age:Int){

    private fun _show()  = println("我是私有方法,只能内部调用")//不能被当前类或子类对象调用

    fun show() {
        println("我是公开方法，可以被子类调用")
        _show()
    }

    companion object{
        fun find() {
            println("我只能被当前类调用，不可继承")

        }

    }
}

class Man(name:String,age:Int):Human(name,age)

fun main() {
    val obg = Man("obg",27)
    obg.show()
    Human.find()


}