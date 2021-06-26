package cn.kk.mooc.chapter5.section4;

/**
 * Java 的 Lambda 表达式
 */
public class LambdaJ {

    public static void main(String[] args) {

        ClickCallback callback = event -> System.out.println(event + " is click.");

    }


    interface ClickCallback {

        void onClick(int event);
    }
}
