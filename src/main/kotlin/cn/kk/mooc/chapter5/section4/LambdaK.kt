package cn.kk.mooc.chapter5.section4

/**
 * Kotlin 的 Lambda 表达式, 就是匿名函数
 */
fun main(){



  val func: () -> Unit = fun(){
      println("This fun is print Hello")
  }

    val lambda: () -> Unit = {
        println("这是 Lambda 表达式定义")
    }

    val lamb = {
        println("这是 Lambda 表达式定义")
    }

    // 匿名函数
    val f1 = { p: Int ->
        println(p)
        "Hello"
    }

    println(f1(333))

    // 调用匿名函数 func
    funcH()
}

// region 函数

// region 普通函数
fun hello(){
    println("hello")
}

/**
 * 匿名函数
 */
val funcH = fun(){
    println("hello...")
}

/**
 * 匿名函数类型
 * 这里的类型为：() -> Unit
 * 这个和 funcH 是一样的，只不过把类型显示声明出来了
 */
val funcHH: () -> Unit = fun(){
    print("hello hh...")
}


// endregion
