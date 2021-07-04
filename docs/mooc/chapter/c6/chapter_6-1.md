## 6-1 [高阶函数](../../../../src/main/kotlin/cn/kk/mooc/chapter6/Demo1.kt)
返回值为函数类型，参数类型是函数

```kotlin
fun returnsFunction(): () -> Long {
    return { System.currentTimeMillis() }
}
```
### 常见的高阶函数

```kotlin
inline fun IntArray.forEach(action: (Int) -> Unit): Unit {
    for(element in this) action(element)
}
```

参数类型：transform: (Int) -> R
```kotlin
inline fun <R> IntArray.map(transform: (Int) -> R): List<R> {
    return mapTo(ArrayList<R>(size), transform)
}
```
