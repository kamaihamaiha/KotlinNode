### [常量和变量](../../../../src/main/kotlin/cn/kk/mooc/chapter5/section1/Demo.kt)

```kotlin
// 变量
var a = 1

// 只读变量
val b = 2

// 常量
const val c = 3
```

#### 常量

- 只能定义在全局范围
- 只能修饰基本类型
- 必须立即用字面量初始化

##### 编译器常量和运行时常量

```kotlin
// 编译时即可确定常量的值
const val b = 3

// 运行时才能确定值，调用出通过引用获取值
val c: Int

```