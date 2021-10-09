package cn.kk.first.utils

import java.text.SimpleDateFormat
import java.util.*

object TimeHelper {

    fun getTime() = SimpleDateFormat("yyyy-mm-dd: mm:ss").format(Date())
}