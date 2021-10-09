package cn.kk.first.goods

/**
 * 接口
 * 可以定义属性，如：type
 */
interface Food {
    val type: String
        get() = "食物"
}