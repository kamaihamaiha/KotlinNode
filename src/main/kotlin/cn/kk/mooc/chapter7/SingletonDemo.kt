package cn.kk.mooc.chapter7

/**
 * 单例
 */
object SingletonDemo {

    @JvmField // 加上这个后，Java 中可以直接 SingletonDemo.x 调用
    var x = 2

    @JvmStatic
    fun y(){

    }
}
