package cn.kk.mooc.chapter4.section2

/**
 * 穷光蛋
 */
class PoorGuy {

    var pocket: Double = 0.1

    fun PoorGuy.noMoney(){

    }

    // 扩展成员
    var PoorGuy.moneyLeft: Double
    get() {
        return this.pocket
    }
    set(value) {
        pocket = value
    }
}