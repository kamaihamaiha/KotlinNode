package cn.kk.mooc.chapter4.section1

/**
 * 定义男性
 */
open class Male(): Human() {


    /**
     * 用 final 修饰，子类不可以重写了
     */
   final override fun gender(): String {
       return "男性"
    }

    override fun race(): String {
        return "藏族"
    }
}