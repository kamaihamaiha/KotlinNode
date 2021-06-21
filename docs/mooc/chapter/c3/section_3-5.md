## [函数](../../../../src/main/kotlin/cn/kk/mooc/chapter3/KotlinFunc.kt)

#### Kotlin 函数学习路线
1. 基本概念
    - 函数的基本用法
    - 函数的引用
2. 匿名函数
    - Lambda
    - SAM 转换
3. 高阶函数
    - 常见高阶函数
    - 函数式编程
   
---

### 函数 VS 方法

- 方法可以认为是函数的一种特殊类型
- 从形式上，有 receiver 的函数即为方法

### 函数的类型

```kotlin
fun foo() {}    () -> Unit

fun foo(age: Int): String { ... }       (int) -> String

// Foo 就是方法 bar 的 receiver
class Foo {
    fun bar(name: String, weight: Long): Any { ... }    Foo.(String,Long) -> Any
}
```

### 函数的引用

- 函数的引用类似 C 语言中的函数指针，可用于函数传递

```kotlin
fun foo(){}     ::foo

fun foo(age: Int): String { ... }       ::foo

class Foo {
    fun bar(name: String, weight: Long): Any { ... }        Foo::bar
}
```

### 变长参数
```kotlin
fun work(vararg args: String){
    println(args.contentToString())
}
```

### 多返回值

```kotlin

```