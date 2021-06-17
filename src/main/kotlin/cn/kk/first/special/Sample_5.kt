package cn.kk.first.special

fun main(){

    foo()
    print("\n")
    foo2()

}

fun foo(){
    listOf(1, 2, 3, 4, 5).forEach {
        // 这里 return 返回的是 foo() 方法
        if (it == 3) return
        print(it)
    }
    print("foo() over")
}

fun foo2(){
    listOf(1, 2, 3, 4, 5).forEach lit@{
        // 这里的 return 从 Lambda 中返回. forEach() 循环只会在 3 时，return。
        if (it == 3) return@lit
        print(it)
    }
    print("foo2() over")
}