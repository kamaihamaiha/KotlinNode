### Kotlin 独特语法特性

1. 表达式可作为函数的主体
2. Unit 对应 Java 中的 Void
3. 可变参数使用 vararg 定义。
    ```kotlin
    fun showCars(vararg carBrand: String) {
        for (car in carBrand) {
            println(car)
        }
    }
    ```
4. 可以为表达式添加标签
- 只能作用于 break, continue, return
- [代码](../src/main/kotlin/cn/kk/first/special/Sample_4.kt)

5. 用标签实现在 Lambda 中返回
- [代码](../src/main/kotlin/cn/kk/first/special/Sample_5.kt)

6. 可以通过主构造方法的参数为类直接定义属性
- [代码](../src/main/kotlin/cn/kk/first/special/Sample_6.kt)

7. 具体类默认是 **final** 的，不能被继承，如果要继承，要用 **open** 修饰

8. 在类内部定义类有两种：嵌套类和内部类
- 嵌套类：相当于 Java 的静态内部类，不能使用外部类的 this
- 内部类：用 `inner class` 定义，相当于 Java 的私有非静态内部类，可以访问外部类的 this

9. 所有类都从 **Any** 派生，相当于 Java 中的 Object

10. 方法默认是 **final** 的，所以要想被子类重写，要用 **open** 修饰

11. 使属性或者方法可以被静态调用，要在 `companion object` 代码块中定义

12. 匿名内部类
- 用 **object** 关键字
- [代码](../src/main/kotlin/cn/kk/first/special/Sample_12.kt)

13. 语法上直接支持单例模式
- 用关键字 **object** 定义类
- [代码](../src/main/kotlin/cn/kk/first/special/Sample_13.kt)

14. 可以在一个类中为另一个类定义扩展
- 扩展：为已存在的类添加新的方法或属性，不会影响类的原有代码
- [代码](../src/main/kotlin/cn/kk/first/special/Sample_14_B.kt)

15. 可定义至于用包含数据的类
- 这种类叫作：**数据类**
- 用 **data class** 修饰
- **data** 修饰符起的作用是(为类添加几个方法)：
   1. equals()
   2. hashCode()
   3. toString()
   4. copy()
   
- 还可以自由添加方法，但是设计这个的目的就是当作数据容器，所以不要添加无关的代码
- [代码](../src/main/kotlin/cn/kk/first/special/Sample_15.kt)

16. 支持封闭类
- 封闭类的子类数量有限
- 要求子类必须在其所在的文件中创建
- sealed class 修饰

17. 定义函数类型时，还可以指定调用此函数的对象