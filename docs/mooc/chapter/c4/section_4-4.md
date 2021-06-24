## 4-3 智能类型转换

```kotlin
// 第一种
val human: Human = Female("女性")
if (human is Female){
    println(human.name)
}

// 第二种
var name: String? = null  // name 为可空类型 String?
name = "benny"
if (name != null){ // 判断后，自动将 name 转换成类不可空类型：String. 只在 { } 范围之内生效
    println(name.length)
}
```

### 类型的安全转换

```kotlin
val human: Human = Child()
println((human as? Child)?.name)
```

### 不支持

不支持访问外部变量。