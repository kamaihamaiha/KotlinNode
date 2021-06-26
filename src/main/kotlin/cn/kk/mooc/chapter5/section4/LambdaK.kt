package cn.kk.mooc.chapter5.section4

/**
 * Kotlin 的 Lambda 表达式, 就是匿名函数
 */
fun main(){

  val func: () -> Unit = fun(){
      println("This fun is print Hello")
  }

    val lambda: () -> Unit = {
        println("hello")
    }

    // 匿名函数
    val f1 = { p: Int ->
        println(p)
        "Hello"
    }

    println(f1(333))
}
