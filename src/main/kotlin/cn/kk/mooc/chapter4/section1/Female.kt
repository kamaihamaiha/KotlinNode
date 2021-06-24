package cn.kk.mooc.chapter4.section1

/**
 * 定义女性
 */
class Female: Human() {
    override fun gender(): String {
        return "女性"
    }

    override fun race(): String {
        return "汉族"
    }

}