## Kotlin 

#### [Mooc](./docs/mooc/README.md)


#### 书本
- 新式语法特性
- [独特语法](./docs/special_syntax.md)
- [作用域函数](./docs/region_fun.md)

### 新式语法特性

1. 不需要分号
2. 使用明确的关键字定义方法
```kotlin
fun sum(a: Int, b: Int): Int{
    return a + b
}
```
3. 使用明确的关键字定义变量，并且对常量和变量用不同的关键字区分
- var 表示变量
- val 表示常量

4. 方法的返回值类型放在后面，使用 ":" 分隔，如：
```kotlin
fun isGood(): Boolean {
    return true
}
```
5. 变量和常量的类型放在后面，使用":" 分隔，如：
```kotlin
var money: Int = 99
val name: String = "Trump"
```
6. 不再完全忠诚于面向对象
- 支持全局函数
- 可以在类外面定义函数
- 可以把函数保存在变量中
- 可以定义函数类型，和 C/C++ 一样

7. 支持 Lambda 表达式
8. 定义变量时可以省略类型。前提是编译器可以推导出来
9. 可以在字符串中嵌入表达式，如：
```kotlin
val name = "Kotlin"
val des = "This language is ${name}"
```
10. 可空类型和不可空类型作为两种类型对待，以 ？ 区分
```kotlin
// 不可空类型
val name = "kotlin"

// 可空类型
var nike: String ?= null

// 把可空类型转换成不可空类型
name = nike!!
```
11. 表示范围
``for(i in 1..8 step 2)``
    
12. 所有类型都是对象，不存在基础类型。因此可以这么写代码：
```kotlin
if (110.equals(99)){
    "床前明月光".get(0)
}
```
13. 增加 "===" 操作符，用于确定两个变量是不是引用同一个对象。相当于 C 语言中的直接比较指针
14. 显式类型转换
- 编译器一般不帮助自动类型转换，开发者应该明确知道每一个转换的后果，所以大多数情况下都需要开发者自己进行类型转换。
15. 创建对象时不再用 new
16. 支持 if ... else ... 表达式
```kotlin
var a = 100
var b = 200
val max = if (a > b) {
    a
} else {
    b
}
```
- 因此在 Kotlin 中不再有三目运算符了，a > b ? a : b 要这么实现： `if (a > b) a else b`

17. 用 when 代替 switch ... case
- [代码](./src/main/kotlin/cn/kk/first/Sample_17.kt)
18. 在类中定义成员变量其实是属性，而不是字段
```kotlin
class Message {
    var title: String? = null
    var content: String? = null
}
```
上面的 title 和 content 会自动生成 getter 和 setter 方法。如果要定制 getter 和 setter 方法，可以如下：
```kotlin
var title: String?= null
    get() = field + ":"
```
19. 有默认构造方法
- 直接在类名后加小括号定义
- 没有方法体，如果要定制内部的程序逻辑，在 init 代码块中操作
20. 非默认构造方法必须调用默认构造方法
- [代码](./src/main/kotlin/cn/kk/first/Message.kt)
21. 枚举也是类
- [代码](./src/main/kotlin/cn/kk/first/Color.kt)
22. 属性也可以被覆盖（Override）
- 因为属性的本质是函数
23. 接口中可以定义属性
- 属性是抽象的，子类必须重写
24. 可以在不继承类的情况下，为类添加方法 => 扩展
- 扩展出来的属性，不是字段，只能实现 getter 方法，是 val，不能赋初始值
- 一般用于别人写的类上
25. 类型转换用 as 关键字。如：
``val a: String = Color.RED as String``
- 如果两种类型不匹配，这个转换会返回 null
26. 当连续调用某个对象的多个方法时，可以用 with 让对象只出现一次。如：
```kotlin
val name = String()
with(name) {
    val sA = startsWith("a")
    val eB = endsWith("b")
    val subN = subSequence(0, 3)
}
```