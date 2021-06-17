package cn.kk.first.region

fun main(){

    Person("Bush",11,"Yelu").let {
        println(it)
        it.age
        it.name
        it.school
    }
}