package cn.kk.mooc.chapter7

import cn.kk.mooc.chapter6.Person

fun main(){


    // 内部类使用
    val a = Outer().InnerA()
    val b = Outer.InnerStaticB()

    // 数据类使用
    val book: Book = Book(1, "book", Person("kk", 99))
    val id = book.component1()
    val name = book.component2()
    val author = book.component3()

    val(id2, name2, author2) = book

    val pair = "hello" to "world"
    val(h, w) = pair

    val idle: State = State.Idle
    idle.next()

}