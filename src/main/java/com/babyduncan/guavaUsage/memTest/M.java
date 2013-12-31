package com.babyduncan.guavaUsage.memTest;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/31/13 14:59
 * 不断的申请内存，直到堆栈溢出。
 */
public class M {

    public static void main(String... args) {
        String s = "aaaaaaaaaaaa";
        while (true)
            s = s + s;
    }

}
