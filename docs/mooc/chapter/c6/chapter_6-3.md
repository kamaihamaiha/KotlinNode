## 6-3 [几个有用的高阶函数](../../../../src/main/kotlin/cn/kk/mooc/chapter6/Demo3.kt)

|函数名|介绍|推荐指数|
|---|---|---|
| let | val r = X.let { x -> R } 返回表达式结果| 🌟🌟🌟 |
| run | val r = X.run { this: X -> R } 返回表达式结果| 🌟 |
| also | val x = X.also { x -> Unit } 返回 Receiver| 🌟🌟🌟 |
| apply | val x = X.apply { this: X -> Unit } 返回 Receiver | 🌟 |
| use | val r = Closeable.use { c -> R } 自动关闭资源| 🌟🌟🌟 |