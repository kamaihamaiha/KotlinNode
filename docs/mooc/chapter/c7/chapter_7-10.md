## 7-10 密封类 sealed class

- 密封类是一种特殊的抽象类
- 子类定义在与自身相同的文件中
- 子类个数是有限的

```kotlin
sealed class PlayerState {
    // 构造器是私有的
    constructor()
}

object Idle: PlayerState()

class Playing(val song: Song): PlayerState(){}

class Error(val errorInfo: ErrorInfo): PlayerState(){}
```