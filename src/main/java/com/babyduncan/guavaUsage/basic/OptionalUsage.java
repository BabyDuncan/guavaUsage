package com.babyduncan.guavaUsage.basic;

import com.google.common.base.Objects;
import com.google.common.base.Strings;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/23/13 17:31
 */
public class OptionalUsage {

    public static void main(String... args) {
//        Optional<Integer> possible = Optional.of(5);
//        System.out.println(possible.isPresent()); // returns true
//        System.out.println(possible.get()); // returns 5
//
//        Optional<String> stringOptional = Optional.of(null);
//        System.out.println(stringOptional.isPresent());
        String s = null;
        System.out.println(Objects.firstNonNull(s, "aaa"));
        String s1 = "foobar";
        System.out.println(Objects.firstNonNull(s1, "no"));      // 可以用来从集合中获取一个非空得参数，为空就为期初始化默认值。

        String s2 = "";
        System.out.println(Strings.emptyToNull(s2));
        System.out.println(Strings.isNullOrEmpty(s2));
        System.out.println(Strings.nullToEmpty(null));
    }

}
