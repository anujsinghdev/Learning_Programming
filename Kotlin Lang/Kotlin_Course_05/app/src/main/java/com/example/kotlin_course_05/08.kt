package com.example.kotlin_course_05

fun main() {
    var obj = C()
    obj.show()

}

interface A {
    fun show(){
        println("Interface A")
    }
}

interface B {
    fun show(){
        println("Interface B")
    }
}

class C : A, B {
    override fun show() {
        super<A>.show()
        super<B>.show()
    }
}