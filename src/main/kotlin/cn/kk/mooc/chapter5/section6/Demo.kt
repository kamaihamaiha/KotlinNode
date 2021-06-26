package cn.kk.mooc.chapter5.section6

fun main(){

    val value = "HelloWorld"

    println(value + 4)

    println(value - "Hello")

    println(value * 3)
    println("*" * 30)

    println(value / "l")
    println(value / "ld")
    println(value / "o")

}

/**
 * 加
 */
operator fun String.plus(right: Any?): String{
    return this.plus(right?.toString())
}

/**
 * 减
 */
 operator fun String.minus(right: Any?): String = this.replaceFirst(right.toString(),"")

/**
 * 乘
 */
operator fun String.times(count: Int): String {
    return (1..count).joinToString("") {this}
}

/**
 * 除
 */
operator fun String.div(target: Any?): Int{
    val str = target.toString()
    return this.windowed(str.length,1){ // windowed 窗口滑动，每次比较 str.length 长度的内容，每次滑动 1 下， 下面判断滑动到到位置内容 == str
        it == str
    }.count {it} // 符合 it == str 的个数
}