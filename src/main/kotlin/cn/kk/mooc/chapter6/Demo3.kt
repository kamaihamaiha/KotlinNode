package cn.kk.mooc.chapter6

import java.io.File

/**
 * 几个有用的高阶函数
 * 1. let()
 * 2. run()
 * 3. also()
 * 4. apply()
 * 5. use()
 */
fun main(){

    val person = Person("Trump",12)

    // let
    person.let(::println)

    // run
    person.run(::println)

    // also 有返回值
   val person2 = person.also {
        it.name = "Obama"
    }

    // apply
    person.apply {
        name = "xxx"
    }

    // use
    File("build.gradle").inputStream().reader().buffered()
        .use {
            println(it.readLines())
        }


}

class Person(var name: String, var age: Int){

}