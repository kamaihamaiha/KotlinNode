package cn.kk.first.special


fun main() {

   loop@ for (i in 1..99){
        for (j in 1..88){
            if (i == 8){
                // 打开外部的循环
                break@loop
            }
        }
    }
}

