package cn.kk.mooc

fun main(){

    val c1 = intArrayOf(1,2,3,4,5)
    val c2 = IntArray(5){it}

    // 打印数组，contentToString() 很好用
    println(c1.contentToString())
    println(c2.contentToString())
}