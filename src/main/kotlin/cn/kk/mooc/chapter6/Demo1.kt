package cn.kk.mooc.chapter6

/**
 * 高阶函数
 */
fun main(){

    //region intArray forEach 三种写法
    // 第一种
    (1..3).forEach({
        println(it)
    })

    // 第二种：函数类型为最后一个参数，可以移到括号外面
    (1..3).forEach(){
        println(it)
    }

    // 第三种：只有一个 Lambda 表达式作为参数，() 可以省略。 只有一个参数的 Lambda 表达式，参数的形参可以写成：it
    (1..3).forEach {
        println(it)
    }
    //endregion intArray forEach 三种写法

    val intArray = IntArray(3)
    intArray.forEach{ println(it) }

    // 调用 cost，统计 sleep() 函数执行的时间
    cost {
        sleep()
    }
}

/**
 * 定义高阶函数，用来统计某个函数执行的时长
 */
fun cost(block: () -> Unit){
    val start = System.currentTimeMillis()
    block()
    println(System.currentTimeMillis() - start)
}

fun sleep(){

    Thread.sleep(2000)
}