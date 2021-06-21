### [Kotlin 集合框架](../../../../src/main/kotlin/cn/kk/mooc/chapter3/KotlinCollections.kt)

- 增加了 "不可变"集合框架的接口
- 没有另起炉灶，复用 Java API 的所有实现类型
- 提供了丰富易用的方法，例如 forEach/map/flatMap
- 运算符级别的支持，简化集合框架的访问


##### List

- 不可变 List: `List<T>`
- 可变 List: `MutableList<T>`

##### Map
- 不可变 Map: `Map<K,V>`
- 可变 Map: `MutableMap<K,V>`

##### Set
- 不可变 Set: `Set<T>`
- 可变 Set: `MutableSet<T>`


---

### Pair

```kotlin
// 第一种方式
val pair = "Hello" to "Kotlin"

// 第二种方式
val pair2 = Pair("Hello","Kotlin")

// 获取元素
val first = pair.first
val second = pair.second

// 解构
val (x,y) = pair
```

### Triple

```kotlin
val triple = Triple("one",1, 1.0)
val first = triple.first
val second = triple.second
val third = triple.third

val (x,y,z) = triple
```

