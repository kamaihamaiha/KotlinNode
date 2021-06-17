package cn.kk.first.special

class Sample_14_B {

    fun methodOfB(){
        println("Class B")
    }

    // 定义 Sample_14_A 类的扩展. 该扩展只能在 Sample_14_B 中调用，Sample_14_B 之外不能用。 想要更大范围使用，可以在类外面定义类 Sample_14_A 的扩展
    fun Sample_14_A.method2OfA(){
        methodOfA()
        this@Sample_14_B.methodOfB()
    }
}