#### [3-1 基本类型](../../../../src/main/kotlin/cn/kk/mooc/chapter3/KotlinBasicTypes.kt)

- Byte
- Int & Long
- Float & Double
- Char
- String

##### 声明变量

- val: 只读变量
- var: 可读可写变量

```Kotlin
val info: String = "Hello Kotlin"

// 类型自动推导
val info = "Hello Kotlin"
```
相当于 Java 中的：
```java
final String info = "Hello Kotlin";
```

##### 数值类型转换

不能隐式类型转换，要主动转换。如：
```kotlin
val a: Int = 10
val b: Long = a.toLong()
```

##### 无符号类型(V1.3)

|        | 有符号类型 | 无符号类型 |
| ------ | ---------- | ---------- |
| 字节   | Byte       | UByte      |
| 短整型 | Short      | UShort     |
| 整型   | Int        | UInt       |
| 长整型 | Long       | ULong      |
| 字符串 | String     | String     |

##### 快捷键

IDEA 中，鼠标光标在变量区域，按下：*Control + Shift + P* 就会显示该变量的类型。