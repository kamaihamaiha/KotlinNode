package cn.kk.mooc.chapter7

enum class State(val id: Int) {

    Idle(0), Busy(1)
}

fun State.next(): State {
    return State.values().let {
        val nextOrdinal = (ordinal + 1) % it.size
        it[nextOrdinal]
    }
}