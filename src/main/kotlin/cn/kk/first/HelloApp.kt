package cn.kk.first

import java.util.*

fun main() {


    val name = String()
    with(name) {
        val sA = startsWith("a")
        val eB = endsWith("b")
        val subN = subSequence(0, 3)
    }

    val sA = name.startsWith("a")
    val eB = name.endsWith("b")
    val subN = name.subSequence(0, 3)

    if (110.equals(99)) {
        "床前明月光".get(0)
    }

    println("Hello world")

    val a = 100
    val b = 90

    // if else 表达式
    val max = if (a > b) a else b

    println("max is $max")

    // when
    val c = 99
    when (c) {
        1 -> print("a == 1")
        2 -> print("a == 2")
        in 3..8 -> print("a 在 3~8 以内")
        9, 10 -> print("a == 9 or a == 10")
        !in 20..28 -> print("a 不在 20 与 28 之间")
    }

    when {
        c % 2 == 1 -> print("C 是奇数")
        c % 2 == 0 -> print("C 是偶数")
    }

    // with
    val message: Message = Message("title", System.currentTimeMillis())

    showLog(message)

    message.apply {
        title = "..."
        timeStamp = -1
    }
    showLog(message)

    with(message) {
        title = "xxx"
        timeStamp = 10
    }
    showLog(message)

    // call fun: showCars()
    showCars("BMW")
    showCars("Toyota", "Honda", "Benz")


}

// 表达式可以作为函数的主体
fun sum(a: Int, b: Int): Int = a + b

// 表达式可以作为函数的主体
fun showLog(msg: Message) = println("message: title:${msg.title}, timeStamp:${msg.timeStamp}")

// 可变参数的方法
fun showCars(vararg carBrand: String) {
    for (car in carBrand) {
        println(car)
    }
}