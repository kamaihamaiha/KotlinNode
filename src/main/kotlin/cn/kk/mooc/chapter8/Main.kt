package cn.kk.mooc.chapter8

fun main(){


    // 比较任意类型数的大小
}

fun <T: Comparable<T>> maxOf(a: T, b: T): T{
    return if (a > b) a else b
}

/**
 * 多个约束
 * 1. 比较大小
 * 2. 然后执行大的那个对象的方法（这里是构造方法）
 */
fun <T> callMax(a: T, b: T) where T: Comparable<T>, T: () -> Unit {
    if(a > b) a() else b()
}

/**
 * 多个泛型参数
 */
fun <T, R> callMax(a: T, b: T): R where T: Comparable<T>, T: () -> R {
    return if(a > b) a() else b()
}

/**
 * 多个泛型参数2
 * 约束 R 类型
 */
fun <T, R> callMax2(a: T, b: T): R where T: Comparable<T>, T: () -> R, R: Number {
    return if(a > b) a() else b()
}