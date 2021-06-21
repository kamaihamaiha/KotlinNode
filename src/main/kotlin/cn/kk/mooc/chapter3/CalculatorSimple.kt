package cn.kk.mooc.chapter3

import java.lang.Exception

fun main(vararg args: String){
    if (args.size < 3){
        return showHelp()
    }

    val operators = mapOf(
        "+" to::plus, //to 相当于 Pair
        "-" to::minus,
        "*" to::times,
        "/" to::div
    )

    val op = args[1]
    val opFunc = operators[op] ?: return showHelp()

    try {
       println("Input: ${args.joinToString(" ")}")
        println("Output: ${opFunc(args[0].toInt(), args[2].toInt())}")
    }catch (e: Exception){
        println("Input error!")
    }
}

fun showHelp() = println("""
    Simple Calculator:
    Input: 3 * 4
    Output: 12
""".trimIndent())

fun plus(numA: Int, numB: Int): Int{
    return numA + numB
}
fun minus(numA: Int, numB: Int): Int{
    return numA - numB
}

fun times(numA: Int, numB: Int): Int{
    return numA * numB
}

fun div(numA: Int, numB: Int): Int{
    return numA / numB
}