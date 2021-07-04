## 代理 Delegate

代理：我代替你去处理它

- 接口代理
- 属性代理


### 接口代理

#### 第一种：这样要重写所有的方法，太麻烦
```kotlin
interface Api {
    fun a()

    fun b()

    fun c()
}

class ApiImpl : Api {
    override fun a() {
        TODO("Not yet implemented")
    }
    override fun b() {
        TODO("Not yet implemented")
    }
    override fun c() {
        TODO("Not yet implemented")
    }
}
```

#### 第二种：想重写哪个就重写哪个

```kotlin
interface Api {
    fun a()
    fun b()
    fun c()
}

class ApiWrapper(val api: Api) : Api by api {
    override fun a() {
        println("c is called.")
        api.c()
    }
}
```

### 属性代理
- Lazy
- observable

#### Lazy
接口 Lazy 的实例代理类对象 Person 的实例的属性 **firstName** 的 **getter**
```kotlin
class Person(val name: String){
    val firstName by lazy {
        name.split(" "[0])
    }
}
```

#### observable
