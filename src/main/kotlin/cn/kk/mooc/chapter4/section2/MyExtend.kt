package cn.kk.mooc.chapter4.section2

// 自定义的扩展方法

/**
 * 左右都加上指定个数的字符
 */
fun String.padding(count: Int, char: Char = ' '): String {
    val padding = (1 .. count).joinToString(""){ char.toString() }
    return "${padding}${this}${padding}"
}

/**
 * 把自己本身复制 count 倍
 */
fun String.times(count: Int): String {
    return (1 .. count).joinToString(""){this}
}

/**
 * 把自己本身复制 count 倍
 *@param count 复制的倍数
 * @param separator 间隔符
 */
fun String.times(count: Int, separator: String): String {
    return (1 .. count).joinToString(separator){this}
}