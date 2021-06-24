package cn.kk.mooc.chapter4.section1

/**
 * 抽象类，人类
 */
abstract class Human {

    /**
     * 定义抽象方法，子类必须实现。子类必须有性别
     */
    abstract fun gender(): String

    /**
     * 民族，子类可以重写
     */
    open fun race(): String{
        return "人类民族"
    }

    /**
     * 人类总数方法。该方法不能被重写
     */
    fun count(): Int{
        return 99999;
    }

}