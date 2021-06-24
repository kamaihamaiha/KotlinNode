package cn.kk.mooc.chapter4.section1

/**
 * 属性引用
 */
fun main(){

    // 访问 Trump 的 age 属性. ==> 属性引用

    // 未绑定 Receiver, 设置 ageRef 时，需要传入 trump 实例对象
    val ageRef = Trump::age

    val trump = Trump("Trump",77,"总统")

    // 绑定了 Receiver， nameRef 可以直接设置
    val nameRef = trump::name
    ageRef.set(trump,88)

    nameRef.set("Bush")
}