package cn.kk.first.region

/**
 * let()
 * 上下文对象是：it
 * 返回值：返回 Lambda 表达式中的值
 */
fun main(){

    Person("Bush",11,"Yelu").let {
        println(it)
        it.age
        it.name
        it.school
    }
}