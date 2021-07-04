## 类的构造器

#### 构造器的基本写法
```kotlin
class Person (var age: Int, name: String)
```
- var 或者 val 修饰，是参数也是属性。（age）类内全局可见
- 不加修饰，是参数. 构造器内可见（init 块，属性初始化）
- init 块类似主构造器的方法体, init 可以有多个
- 属性必须初始化

#### 副构造器

```kotlin
class Person(var age: Int, var name: String): Animal(){
    
    // 副构造器必须要调用主构造器
    constructor(age: Int): this(age,"xxx")
}
```
- 推荐定义主构造器

#### 不定义主构造器的情况

```kotlin
class Person: Animal {
    var age: Int
    var name: String
    
    // 如果没有定义主构造器，那么定义副构造器时要调用父构造器。如果父构造器无参数，那么可以省略
    constructor(age: Int, name: String): super(){
        this.age = age
        this.name = name
    }
    
    // 如果有多个构造器，那么可以调用父类构造器或者自己的其他构造器
    constructor(age: Int): this(age, "xxx")
}
```

#### 主构造器默认参数（推荐）
```kotlin
@JvmOverloads // 如果想在 Java 中使用（以重载的形式调用），就加上这个注解
class Person(var age: Int, var name: String = "xxx"): Animal()
```