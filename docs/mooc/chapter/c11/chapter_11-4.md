## 11.4 协程的基本要素1

- 挂起函数：suspend
  - 在函数 fun 关键字前面加上 suspend
  - 挂起点：挂起函数调用的地方  
  - 只能在 **其他挂起函数**或**协程**中调用  
  - 调用时包含了协程**挂起**语义  
  - 返回时包含了协程**恢复**语义  
    
- Continuation
  
### 挂起函数的类型
suspend() -> Unit
```kotlin

 suspend fun foo(){}

// => 最终转化成
fun foo(continuation: Continuation<Unit>): Any{}
```

suspend(Int) -> String
```kotlin
suspend fun bar(a: Int): String{
    return "Hello"
}

// => 最终转化成
fun bar(a: Int, continuation: Continuation<String>): Any {
    return "Hello"
}
```

### 将回调转写成挂起函数
- 使用 suspendCoroutine 获取挂起函数的 Continuation
- 回调成功的分支用 Continuation.resume()
- 回调失败使用 Continuation.resumeWithException(e)

// 听力的知识圈首页接口改写。
```kotlin
suspend fun getKnowLedgeHome(refreshType: String) = suspendCoroutine<KnowledgeHomeModel> {
        continuation ->
        TingHttpApi.ShareInstance().getKnowledgeHome(refreshType, object : HttpCallback<KnowledgeHomeModel>(){
            override fun onSuccess(result: KnowledgeHomeModel?) {
              // 要真正的挂起，必须异步调用 resume()
                continuation.resume(result!!)
            }

            override fun onFailure(req: Request?, ex: IOException?) {
                continuation.resumeWithException(ex!!)
            }

        })
    }
```
// 然后调用
```kotlin
 suspend { TingHttpApiV2.getKnowLedgeHome(KnowledgeHomeModel.LOAD_MORE) }.startCoroutine(object : Continuation<KnowledgeHomeModel>{
              override val context: CoroutineContext = EmptyCoroutineContext

              override fun resumeWith(result: Result<KnowledgeHomeModel>) {
                 // 协程执行完后调用
                  
              }

          })
```

### 协程的创建

- 协程是一段可执行的程序
- 协程的创建通常需要**一个函数**
- 协程的创建也需**一个API**
