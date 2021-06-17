package cn.kk.first.special

/**
 *
 */
class Sample_12 {


    init {
        // 匿名内部类方式传入参数
        addCallback(object : EatCallback{
            override fun onSuccess() {
            }

            override fun onError(error: String) {
            }

        })
    }

    fun addCallback(eatCallback: EatCallback){

    }

     interface EatCallback {

         fun onSuccess()

         fun onError(error: String)
    }

}