## 7-6 单例 object

#### Java 中：
```java
public class Singleton {
    public static final Singleton INSTANCE = new Singleton();
}
```

#### Kotlin 中：   
不能定义构造方法
```kotlin
object Singleton {
    @JvmField // 这个注解是方便在 Java 中，直接用类名. 调用。
    var x = 0
    
    @JvmStatic // 这个注解是方便在 Java 中，直接用类名. 调用
    fun y(){}
}
```

普通类的静态成员：
```kotlin
class Foo {
    
    @JvmField // 生成非静态 Field
    var z = 3
    companion object {
        @JvmField // 生成静态 Field
        var x = 1
        @JvmStatic
        fun y(){}
    }
}
```
object 类的继承：

```kotlin
object Singleton : Runnable {
    override fun run() {
        
    }
}
```




