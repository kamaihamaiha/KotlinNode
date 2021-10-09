## 7-8 数据类 data class

0. 定义   
[代码](../../../../src/main/kotlin/cn/kk/mooc/chapter7/Book.kt)
```kotlin
data class Book(val id: Long, val name: String, val author: Person)
```
定义在主构造器中的属性又称为：component
可以这么使用：
```kotlin
// 数据类使用
val book: Book = Book(1, "book", Person("kk", 99))
val id = book.component1()
val name = book.component2()
val author = book.component3()
```
编译器基于 component 自动生成类 equals\hashCode\toString\copy 等方法

1. 数据类解构

```kotlin
val book: Book = Book(1, "book", Person("kk", 99))

val(id, name, author) = book
```

2. JavaBean vs data class

data class 
- 不可被继承
- 有 Java Bean 的能力
- Component
    - 主构造器： 想去掉，可以用 NoArg 插件
    - 相等性
    - 解构
- final: 想去掉，可以用 AllOpen 插件

3. 如何使用 data class

- 是纯数据，不需要额外实现。
- 属性类型最好是基本类型、String、其他 Data Class
- 属性最好是 val 的，因为数据改变后，data class 对象的 hashCode 也会改变