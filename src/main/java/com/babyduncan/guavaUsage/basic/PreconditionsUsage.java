package com.babyduncan.guavaUsage.basic;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * User: zgh
 * Date: 13-2-24
 * Time: 17:00
 */
public class PreconditionsUsage {
    public static void main(String... args) {
//        int i = -1;
//        checkArgument(i >= 0, "Argument was %s but expected non negative", i);
//        System.out.println("test");
        String s = null;
        System.out.println(checkNotNull(s, "not null", "fuck"));
    }
}
