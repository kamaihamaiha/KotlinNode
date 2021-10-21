package cn.kk.mooc.chapter8

fun main(){


    // 比较任意类型数的大小


}

fun <T: Comparable<T>> maxOf(a: T, b: T): T{
    return if (a > b) a else b
}

/**
 * 多个约束
 * 1. 比较大小
 * 2. 然后执行大的那个对象的方法（这里是构造方法）
 */
fun <T> callMax(a: T, b: T) where T: Comparable<T>, T: () -> Unit {
    if(a > b) a() else b()
}

/**
 * 多个泛型参数
 */
fun <T, R> callMax(a: T, b: T): R where T: Comparable<T>, T: () -> R {
    return if(a > b) a() else b()
}

/**
 * 多个泛型参数2
 * 约束 R 类型
 */
fun <T, R> callMax2(a: T, b: T): R where T: Comparable<T>, T: () -> R, R: Number {
    return if(a > b) a() else b()
}

/**
 * 泛型的形变：协变
 */
sealed class List<out T> {
    object Nil: List<Nothing>()
}

// region 泛型的形变：协变 举例
/*interface Book

interface EduBook: Book

class BookStore<out T: Book>{
    fun getBook(): T{
        return Book
    }
}

fun covariant(){
    val eduBookStore = BookStore<EduBook>()
    val bookStore = eduBookStore

    val book = bookStore.getBook()
    val eduBook = eduBookStore.getBook()
}*/
// endregion

// region 泛型的形变：逆变 举例
open class Waste

class DryWaste: Waste()

class Dustbin<in T: Waste> {
    fun put(t: T){

    }
}

fun contWaste(){
    // 垃圾桶
    val dustbin = Dustbin<Waste>()
    // 干垃圾桶
    val dryDustbin : Dustbin<DryWaste> = dustbin

    // 垃圾
    val waste = Waste()

    // 干垃圾
    val dryWaste = DryWaste()

    // 把垃圾放到 垃圾桶
    dustbin.put(waste)
    // 把 干垃圾放到 垃圾桶
    dustbin.put(dryWaste)

    // 把 干垃圾放到 干垃圾桶
    dryDustbin.put(dryWaste)



}

// endregion