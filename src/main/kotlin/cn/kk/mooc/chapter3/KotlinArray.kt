package cn.kk.mooc

fun main(){

    val c1 = intArrayOf(1,2,3,4,5)
    val c2 = IntArray(5){it}

    // 打印数组，contentToString() 很好用
    println(c1.contentToString())
    println(c2.contentToString())

    // 数组的读写
    val d = arrayOf("Hello", "World")
    d[1] = "Kotlin"
    println("${d[0]}, ${d[1]}")

    // 数组的遍历
    val e = floatArrayOf(1f, 2f, 4f, 6f)
    e.forEach { element ->
        println(element)
    }

    // 判断元素是否在数组里面
    if (1f in e){
        println("1f 在 e 数组里面")
    }

    if (8f !in e){
        println("8f 不在 e 数组里面")
    }
}