package cn.kk.mooc.chapter5.section3

import java.lang.IndexOutOfBoundsException

fun main(){

    val c1 = Complex(1.0,4.0)

    // 调用自定义的操作符方法
    println(c1.plus(9.0))
    println(c1.get(0))
    println(c1.get(1))

    // 调用自定义的中缀表达式
    println("Hello World" rotate 3)

}
// region 操作符
/**
 * 定义复数类
 */
class Complex(var real: Double, var image: Double){
    override fun toString(): String = "$real + ${image}i"
}

// 定义 Complex 类的操作符: plus
operator fun Complex.plus(other: Complex): Complex{
    return Complex(this.real + other.real, this.image + other.image)
}

operator fun Complex.plus(other: Double): Complex{
    return Complex(this.real + other, this.image)
}

operator fun Complex.plus(other: Int): Complex{
    return Complex(this.real + other, this.image)
}

// 定义 Complex 类的操作符：minus
operator fun Complex.minus(other: Double): Complex{
    return Complex(this.real - other, this.image)
}

// 定义 Complex 类的操作符：get
/**
 * @param index 0 返回实部分，1 返回虚部
 */
operator fun Complex.get(index: Int): Double = when(index){
    0 -> this.real
    1 -> this.image
    else -> throw IndexOutOfBoundsException()
}
//endregion 操作符

// region 中缀表达式
/**
 * 从指定位置反转字符串
 * infix: 加上这个(告诉编译器，这是一个中缀表达式)，可以使得调用如下：
 * "hello" rotate 3
 * 否则，要这么调用：
 * "hello".rotate(3)
 */
infix fun String.rotate(count: Int): String{
    val index = count % length
    return this.substring(index) + this.substring(0, index)
}

// endregion 中缀表达式