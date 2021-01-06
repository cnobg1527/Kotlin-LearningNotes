package a第一章_粗略了解


data class Person(val name: String, val id: Int, val age: Int)//data关键字创建数据类

class A
class B

object res{   //只读对象？
    var name = "小红"
}

fun main() {
    //数据类中的component
    val obg = Person("OBG", 6688, 23)
    println(obg.component1())                       //component指构造器中的参数列表依次排序

    //全局方法filter
    val numList = listOf(1,2,3,4,5,6,7,8,9)
    val l = numList.filter {(it > 4 )}
    l.forEach { print("$it ") }
    println()

    //实例判断
    val obj1 = A()
    val obj2 = B()
    val obj3 = A()
    val someList = listOf(obg,obj1,obj2,obj3)       //在一个混合实例列表中判断每个实例的类型
    someList.forEach{
        when(it){
            is A -> println("我是A类的实例")
            is B -> println("我是B类的实例")
            else -> println("未知类型")
        }
    }
    println()

    //创建map和list并进行一些操作，val定义的对象时不能修改其内容的
    var list = listOf("a", "b", "c")        //只读列表，可通过索引操作
    println(list[1])            //索引取值
    println(list.get(1))        //get方法取值，默认最好用索引
    println(list.indexOf("c"))  //返回索引
    println(list.first())       //返回第一个item
    println(list.contains("d")) //检查列表是否包含某item
    println(list.size)          //返回item个数
    println(list.dropLast(2))
    list.forEach{ print("$it ")}
    println()

    println("******************************************")
    var map = mapOf("a" to 1, "b" to 2, "c" to 3)//只读map，键值之间用to链接，通过键索引操作获取值
    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.getOrDefault("r","没有"))
    println(map.minus("a")) //丢掉某个已有的键 返回一个map 原map不变
    map.forEach{ print("$it ")}
    map.let { it }
    println()

    //惰性属性 lazy 目前还不熟

    //扩展属性方法
    fun A.add(i:Int,j:Int):Int = i+j    //为A类扩展了一个函数，而A类并没有创建过这个函数
    val instance1 = A()
    println(instance1.add(3,5) )    //通过实例调用函数

    println(res.name)

    //with语句用于上下文的对象
    val list1 = listOf(1, 2, 3, 4, 5)
    with(list1){
        println(size)       //通过with语句直接调用对象的方法，方法的前缀默认为list1.size或this.size
        println(get(2))
    }

    //对象增加属性？

    //交换两数, 变量必须是同一类型才可以
    var a = 1; var b = 33  //在同一行声明多个变量用;隔开
    var c = "cc";var d = "dd"
    c = d.also { d = c }
    println(c)
    a = b.also { b = a }
    println(a)



}