## 类属性的延迟初始化

- 使用 lateinit
- 

### 使用 lateinit
```kotlin
private lateinit var tvName: TextView

override fun onCreate(...) {
    ...
    if(::tvName.isInitialized){ // 是否初始化了，不推荐使用
        
    }
}
```

### 使用 lazy
推荐使用 ★★★★★
```kotlin
// 只有在 tvName 首次被访问时，才执行
private val tvName by lazy {
    findViewById<TextView>(R.id.tv_name)
}
```