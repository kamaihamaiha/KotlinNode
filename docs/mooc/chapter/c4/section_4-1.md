## 4-1 类和接口

### 类的定义
```kotlin
class Human{
    var x: Int = 0 // 必须初始化
    
    // 定义构造器
    constructor(x: Int){
        this.x = x
    }
    // 普通函数
    fun y(){
        
    }
}

// 主构造方法
class Human(var x: Int, val y: Int){
    fun y(){}
}
```

### 接口的定义和实现

```kotlin
// 定义
interface SimpleInf {
    fun simMethod()
}

// 实现，用 :
class Human : SimpleInf {

    override fun simMethod() {
        TODO("Not yet implemented")
    }
}
```

### [抽象类的定义](../../../../src/main/kotlin/cn/kk/mooc/chapter4/section1/Human.kt)
```kotlin
abstract class AbsClass {
     
}
```

### 几种修饰方法
```kotlin
// 1. 抽象方法，必须重写
abstract fun foo1()

// 2. open 修饰的方法，可以被重写
open fun foo2()

// 3. 普通方法，不能被重写. 默认是 final 的
fun foo3()

```

#### [属性引用](../../../../src/main/kotlin/cn/kk/mooc/chapter4/section1/Demo.kt)