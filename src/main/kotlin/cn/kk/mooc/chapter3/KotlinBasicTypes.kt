package cn.kk.mooc

fun main(){

    var num = 3

    val e = 10

    // 类型转换
    val f: Long = e.toLong()

    val f2 = 1f
    // 类型转换
    val d1 = f2.toDouble()

    val d2 = 2.0


    // Int 无符号
    val g: UInt = 10u
    val h: ULong = 10000000000u

    val i: UByte = 1u

    // region String start
    val k = "What would be your perfect day?"
    val m = String("What would be your perfect day?".toCharArray())
    println(k === m) // 比较引用
    println(k == m) // 比较值

    // raw string
    val html = """
        <!DOCTYPE html>
        <html>
        <head>
        <meta charset="utf-8">
        <title>菜鸟教程(runoob.com)</title>
        </head>
        <body>
            <h1>我的第一个标题</h1>
            <p>我的第一个段落。</p>
        </body>
        </html>
    """

    println(html)
    // region String end

}