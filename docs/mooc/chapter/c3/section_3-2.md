## [3-2 数组](../../../../src/main/kotlin/cn/kk/mooc/chapter3/KotlinArray.kt)

**Kotlin vs Java**

|        | Kotlin | Java |
| ------ | ---------- | ---------- |
| 整型   | IntArray    | int[]      |
| 整型装箱 | Array<Int> | Integer[]  |
| 字符   | CharArray   | char[]      |
| 字符装箱| Array<Char> | Character[] |
| 字符串 | Array<String>| String[]    |

### 数组的创建

```kotlin
val c1 = intArrayOf(1,2,3,4,5)

// 5 是数组大小，it 是数组下标
val c2 = IntArray(5){it + 1}
```

### 数组的读写

