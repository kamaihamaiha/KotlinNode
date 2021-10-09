package cn.kk.mooc.chapter7

import cn.kk.mooc.chapter6.Person

/**
 * 数据类
 */
data class Book(val id: Long, val name: String, val author: Person)
