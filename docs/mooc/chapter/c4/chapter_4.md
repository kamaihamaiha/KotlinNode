## 类型初步

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

### 抽象类的定义
```kotlin
abstract class AbsClass {
     
}
```