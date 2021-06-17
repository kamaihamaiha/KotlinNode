package cn.kk.first

class Message(var title: String = "通知", var content: String) {

    var timeStamp: Long = 0

    init {
        title += ":"
    }

    // 次构造函数
    constructor(title: String,timeStamp: Long): this(title,"不知道通知内容"){
        this.timeStamp = timeStamp
        this.content = "最终内容为：$title"
    }
}