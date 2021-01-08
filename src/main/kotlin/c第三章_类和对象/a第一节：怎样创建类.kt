package c第三章_类和对象

open class Woman(name: String) {  //最初构造器
    val name = name
    var age: Int = 0       //要么把初始化放在 init代码块中，要么直接赋值 不然会报错
    var id: Int = 666666

    constructor(name: String, age: Int, id: Int) : this(name) {//程序先运行init代码，再运行构造器代码
        this.age = age
        this.id = id

    }
    //init {
    //    println("执行初始化块")
    //    age = 0         //将age的初始化放在init中，还是构造器中好？
    //    id = 666666
    //}

    open fun show() {
        println("我可以被重写")
        Woman.add()
        Woman.minus()
    }

    inner class SmallWoman {    //内部类只能通过对象调用
        var height: Int

        init {
            height = 168
        }

        fun draw() {             //内部类调用外部类的show方法
            show()
        }
    }

    companion object { //伴生对象，里面定义的方法只能被当前类调用， 无法继承
        fun add() {                      //private修饰的方法，统一放在伴生对象内包装
            println("add方法被调用")
        }

        fun minus() {
            println("minus方法被调用")
        }
    }
}
interface Usb{
    fun show(){
        println("我是接口")
    }
}

class Obg(name: String, age: Int, id: Int, size: Int) : Woman(name, age, id) ,Usb{
    val size = size

    override fun show() {
        super<Usb>.show()       //类和接口都有相同方法时 需要在箭头符类指名具体类，以免混淆
        super<Woman>.show()
    }
}

fun main() {
    var obg = Woman("obg", 34, 676767)
    println("我是${obg.name} 我${obg.age}岁了,我的id是${obg.id}")
    //obg.SmallWoman().draw()              //可以这样调用内部类方法
    var obg1 = obg.SmallWoman()             //也可以通过对象创建内部类对象，再调用方法
    obg1.draw()
    println("****************************************")
    var obg2 = Obg("hello",23,45,66)//创建子类对象
    obg2.show()
}