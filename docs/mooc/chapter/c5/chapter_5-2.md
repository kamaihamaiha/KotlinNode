## 分支表达式

### if ... else

```java
c = (a == 3 ? 4 : 5);
```
=

```kotlin
c = if (a == 3) 4 else 5
```

### when ...
可以返回值
```kotlin

// 第一种
val b = when(a){
    0 -> 100
    1 -> 300
    else -> 99
}

// 第二种：条件可以写到下面
var x = "foo"
val c = when {
    x is String -> x.length
    x == 1 -> 99
    else -> 88
}


// 第三种
c = when(val input = readLine()){
    null -> 0
    else -> input.length
}
```

### try ... catch

```kotlin

c = try {
    a / b
} catch (e: Exception){
    e.printStackTrace()
    0
}
```