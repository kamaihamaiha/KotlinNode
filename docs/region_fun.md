## 作用域函数

Kotlin 中有 5 个风格相似的函数：
1. let()
2. apply()
3. with()
4. run()
5. also()

这几个函数都是 inline 函数，都是泛型。

#### 引用上下文：

- this: run(), with(), apply()
  - this 可以省略
- it: let(), also()
  - it 不可以省略

#### 返回值

- 返回上下文对象： apply(), also()
- 返回 Lambda 中返回的值：let(), run(), with()
---

### 1. let()
- [代码](../src/main/kotlin/cn/kk/first/region/Sample_Let.kt)
- 上下文对象用 this 引用，返回 Lambda 返回的值
- let 后是一个 Lambda（是作用域），Lambda 的参数是 Person 实例（是 let 操作的对象），被叫作：上下文对象

### 2. apply()
### 3. with()
### 4. run()

- [代码]()
- 上下文对象用 this 引用，返回 Lambda 返回的值

### 5. also()