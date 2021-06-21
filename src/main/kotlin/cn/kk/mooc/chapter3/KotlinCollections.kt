package cn.kk.mooc

fun main(){

    // 不可变 List，不能添加或者删除元素
    val intList1: List<Int> = listOf(1,2,3,4)

    // 可变 List，可以添加或者删除元素
    val initList2: MutableList<Int> = mutableListOf()

    // map region
    val map1: Map<String,Any> = mapOf("name" to "bush", "age" to 20)
    // map region
    val map2: Map<String,Any> = mutableMapOf("name" to "bush", "age" to 20)


    // arrayList
    val stringList = ArrayList<String>()

    // -- 读写
    for (i in 0 .. 9){
        stringList += "num: $i" // 相当于 add()
    }

    // 移除
    for (i in 3 .. 5){
        stringList -= "num: $i" // 相当于 remove()
    }

    val map = HashMap<String,Int>()
    map["hello"]= 120
    println(map["hello"])
}