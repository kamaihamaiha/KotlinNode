### [区间](../../../../src/main/kotlin/cn/kk/mooc/chapter3/KotlinRange.kt)

```kotlin
// 闭区间
val intRange = 1 .. 10 // [1, 10]
val charRange = 'a' .. 'z'
val longRange = 1L .. 100L

// 开区间
val intRangeExclusive = 1 until 10 // [1,10)
val charRangeExclusive = 'a' until 'z'
val longRangeExclusive = 1L until 100L

// 倒序区间
val intRangeReverse = 10 downTo 1 // [10, 9, ... , 1]
val charRangeReverse = 'z' downTo 'a'
val longRangeReverse = 100L downTo 1L

// 区间的步长
val intRangeWidthStep = 1 .. 10 step 2
val charRangeWidthStep = 'a' .. 'z' step 2
val longRangeWidthStep = 1L .. 100L step 5


```