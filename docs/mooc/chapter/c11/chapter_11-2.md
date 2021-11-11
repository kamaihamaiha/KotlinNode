## 11.2 协程常见实现1

### 协程的分类

- 按照调用栈：有栈协程 + 无栈协程(只能在当前函数中执行)
- 按调用关系：对称协程 + 非对称协程

#### Python Generator

无栈 + 非对称

#### Lua Coroutine
有栈
- coroutine.create()
- coroutine.status
- coroutine.resume
- coroutine.yield