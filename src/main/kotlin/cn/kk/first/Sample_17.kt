package cn.kk.first

class Sample_17 {

    fun demo1(){
        val a = 1
        when(a){
            1 -> print("a == 1")
            2 -> print("a == 2")
            3 -> print("a == 3")
            else -> print("a 不是 1 or 2 or 3")
        }
    }

    fun demo2(){
        val c = 99
        when(c) {
            1 -> print("a == 1")
            2 -> print("a == 2")
            in 3..8 -> print("a 在 3~8 以内")
            9,10 -> print("a == 9 or a == 10")
            !in 20..28 -> print("a 不在 20 与 28 之间")
        }
    }

    fun demo3(){
        val c = 99
        when{
            c % 2 == 1 -> print("C 是奇数")
            c % 2 == 0 -> print("C 是偶数")
        }
    }
}