package c第三章_类和对象

class C {
    inner class Inner
}
class B {
    inner class Inner
}

typealias AInner = C.Inner//给类起别名 可以达到缩短代码的目的，仅此而已
typealias BInner = B.Inner