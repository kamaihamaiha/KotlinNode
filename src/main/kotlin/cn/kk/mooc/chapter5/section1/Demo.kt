package cn.kk.mooc.chapter5.section1

fun main(){


    for (i in 0 .. 4){
        println(X().b)
    }
}

class X {

    // 只读变量。注意不是常量
    val b: Int
        get() {
        return (Math.random() * 100).toInt()
        }
}