## 4-3 空类型安全

```kotlin
// name 为不可空类型
var name: String = "Jim"

// nikeName 为可空类型
var nikeName: String? = "888"

```

#### 几种写法

```kotlin

// 1. name 强转成不可空类型
name!!.lenght

// 2. name 如果不为空，则调用 lenght 值
name?.lenght

// 3. else if 运算符。name.lenght 表达式如果是空，那么就返回 0
name.length ?: 0
```

#### [平台类型](../../../../src/main/kotlin/cn/kk/mooc/chapter4/section3/Main.kt)

Kotlin 可以编译成：Java ByteCode, JavaScript, Native。取决于运行在什么平台上

平台类型，要开发者自己处理可空类型。