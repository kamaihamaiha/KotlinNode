package cn.kk.mooc.chapter8;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

    }

    /**
     * 泛型约束
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public <T extends Comparable<T>> T maxOf(T a, T b){
        if (a.compareTo(b) > 0) return a;
        return b;
    }

    /**
     * 多个约束: & 是交叉类型
     * @param a
     * @param b
     * @param <T>
     * @param <R>
     * @return
     */
    public <T extends Comparable<T> & Supplier<R>, R extends Number> R callMax(T a, T b){
        if (a.compareTo(b) > 0) return a.get();
        return b.get();
    }
}
