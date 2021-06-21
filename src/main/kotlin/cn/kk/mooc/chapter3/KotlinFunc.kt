package cn.kk.mooc.chapter3

/**
 * 1. 函数引用
 * 2. 变长参数
 * 3. 多个返回值
 * 4. 默认参数
 * 5. 具名参数
 */
fun main(){

    // 1.使用函数引用
    val x:(Foo,String,Long)->Any = Foo::bar

    yy(x)

    // 2.变长参数
    work("one","two","three")

    // 3.调用多个返回值函数
    val(a,b,c) = multiReturnValues()
    println(a)
    println(b)
    println(c)

    // 4.默认参数 和 5.具名参数
    defaultParameter(1, y = "yyy")

}

/**
 * 定义变长参数
 */
fun work(vararg args: String){
    println(args.contentToString())
}

fun yy(p:(Foo,String,Long) -> Any){
    p(Foo(),"Hello",888)
}

/**
 * 多个返回值
 */
fun multiReturnValues(): Triple<Int, Long, Double>{
    return Triple(1,2L,3.0)
}

/**
 * 默认参数
 */
fun defaultParameter(x: Int, y: String,z: Long = 0L){

}
class Foo{

    fun bar(name: String, salary: Long): Any{
        return 0
    }
}