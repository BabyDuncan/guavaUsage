package com.babyduncan.guavaUsage.basic;

import java.util.Objects;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/23/13 17:50
 */
public class ObjectsUsage {

    public static void main(String... args) {
        System.out.println(Objects.equals("a", ""));
        System.out.println(Objects.equals(null, ""));
        System.out.println(Objects.equals("foobar", null));
        System.out.println(Objects.equals(null, null));

        System.out.println(Objects.hashCode("foobar"));
        System.out.println(Objects.hashCode(null));
    }

}
