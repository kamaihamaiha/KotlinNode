## 11.5 协程的基本要素2

没听懂。。。

### 协程上下文
- 协程执行过程中需要携带数据
- 索引是 CoroutineContext.Key
- 元素是 CoroutineContext.Element
```kotlin

import kotlin.coroutines.Continuationimportimport kotlin.coroutines.EmptyCoroutineContext kotlin.coroutines.startCoroutine

suspend {
    ...
}.startCoroutine(object: Continuation<Unit>{
    override val context = EmptyCoroutineContext
})
```

### 拦截器

- ContinuationInterceptor 是一类协程上下文元素
- 对 Continuation 进行拦截
