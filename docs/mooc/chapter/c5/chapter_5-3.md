## 5-3 [运算符与中缀表达式](../../../../src/main/kotlin/cn/kk/mooc/chapter5/section3/Demo.kt)

[官方文档](https://kotlinlang.org/docs/operator-overloading.html#unary-operations)

### 常见的运算符

```kotlin
// == 与 equals
"Hello" == "world"
"Hello".equals("world")

// + 与 plus
2 + 3
2.plus(3)

// in 与 contains
val list = listOf(1,2,3,4)
2 in list
list.contains(2)

// [] 与 get
val map = mapOf(
    "Hello" to 2,
    "World" to 3
)
val value = map["Hello"]
val value = map.get("Hello")

// [] 与 set
map["World"] = 4
map.set("World",4)

// > 与 compareTo
2 > 3
2.compareTo(3) > 0

// () 与 invoke
val func = fun(){ // 匿名函数
    print("kkkk")
}
func()
func.invoke()

```

### 中缀表达式

#### 例子1
```kotlin
2 to 3
// 等价于
2.to(3)

infix fun <A,B> A.to(that: B): Pair<A, B> = Pair(this, that)
```
#### 例子2
```kotlin
print("helloWorld" rotate 5)

fun String.rotate(count: Int): String {
    val index = count % length
    return this.substring(index) + this.substring(0, index)
}
```
