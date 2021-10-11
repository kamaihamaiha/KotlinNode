## 7-9 枚举类 enum class
枚举的父类是 Enum，所以不能继承其他类。

### 1- 枚举的属性
##### Java
```java
enum State {
    Idle, Busy
}

// Idle
State.Idle.name()

// 0
State.Idle.oridinal()
```

##### Kotlin
```kotlin
enum class State {
    Idle, Busy
}

// Idle
State.Idle.name

// 0
State.Idle.oridinal
```

### 2- 定义构造器

##### Java
```java
enum State {
    Idle(0), Busy(1);
    
    int id;
    
    State(int id){
        this.id = id;
    }
}
```

##### Kotlin
```kotlin

enum class State(val id: Int){
    Idle(0), Busy(1)
}
```

### 3- 实现接口 

#### 3-1 统一实现

##### Java

```java
enum State implements Runnable {
  Idle, Busy;

  @Override
  public void run() {
        
  }
}
```

```kotlin
enum class State : Runnable {
  Idle, Busy;

  override fun run() {
    
  }
}
```

#### 3-12 各自实现

```java
enum State implements Runnable {
  Idle {
    @Override
    public void run() {

    }
  }, Busy {
    @Override
    public void run() {

    }
  }

}
```

```kotlin
enum class State : Runnable {
  Idle {
    override fun run() {

    }
  },
  Busy {
    override fun run() {
      
    }
  }
}
```

### 4- 为枚举定义扩展

```kotlin
fun State.next(): State {
    return State.values().let {
        val nextOrdinal = (ordinal + 1) % it.size
        it[nextOrdinal]
    }
}
```

### 5- 条件分支
```kotlin
val value = when(state){
    State.Idle -> 0
    State.Busy -> 1
}
```

### 6- 枚举的比较
```kotlin
val state: State = State.Idle
if(state < State.Busy){
    ...
}
```

### 7- 枚举的区间
```kotlin
enum class Color {
    White, Red, Green, Blue, Yellow, Black
}

val colorRange = Color.White .. Color.Green
val color = Color.Blue
color in colorRange // false
```

