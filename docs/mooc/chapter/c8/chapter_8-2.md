## 8-2 泛型约束
- [代码](../../../../src/main/kotlin/cn/kk/mooc/chapter8/Main.kt)
- [代码-Java](../../../../src/main/java/cn/kk/mooc/chapter8/Main.java)

T 被 Comparable 约束，实现它或者继承它。
```kotlin
fun <T: Comparable<T>> maxOf(a: T, b: T): T{
    return if (a > b) a else b
}
```

### 多个约束
```kotlin
/**
 * 多个约束
 * 1. 比较大小
 * 2. 然后执行大的那个对象的方法（这里是构造方法）
 */
fun <T> callMax(a: T, b: T) where T: Comparable<T>, T: () -> Unit {
    if(a > b) a() else b()
}
```

### 多个泛型参数
```kotlin
/**
 * 多个泛型参数
 */
fun <T, R> callMax(a: T, b: T): R where T: Comparable<T>, T: () -> R {
    return if(a > b) a() else b()
}
```