## 7-7 内部类

#### Java 中：
```java
public class A {
    // 普通内部类
    class B {}
    
    // 静态内部类
    static class C {}
}
```

#### Kotlin 中：  
```kotlin
class A {
    // 普通内部类
    inner class B
    
    // 静态内部类
    class C
}

```

1. 内部 object:
```kotlin
object OutObject {
    
    object StaticInnerObject
}
```

2. 匿名内部类：   
- 可以实现多个接口，可以继承父类，这个 Java 就不可以.
- 如果定义在「非静态区域」就会持有外部类的引用，定义在「静态区域」就不会持有。

```kotlin
 // runnableCloneable 是交叉类型：Runnable & Cloneable
 val runnableCloneable = object : Runnable, Cloneable {
    override fun run() {
        
    }
    override fun clone(): Any{
        
    }
}
```
3. 本地类和本地函数

就是在方法中定义类或者函数

4. 联合类型

是 A 或者 B，TypeScript 语言支持。
