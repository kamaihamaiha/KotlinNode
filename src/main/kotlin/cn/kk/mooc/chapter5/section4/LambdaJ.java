package cn.kk.mooc.chapter5.section4;

/**
 * Java 的 Lambda 表达式
 * 条件：SAM: Single Abstract Method
 * 1. 是接口
 * 2. 只有一个方法
 */
public class LambdaJ {

    public static void main(String[] args) {

        ClickCallback callback = event -> System.out.println(event + " is click.");

        // 一个 Lambda 表达式
        Runnable lamb = () -> {
            System.out.println("hello");
        };

    }


    interface ClickCallback {

        void onClick(int event);
    }
}
