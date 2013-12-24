package com.babyduncan.guavaUsage.collections;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.Set;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/24/13 16:28
 * k -> list<E>
 */
public class MultimapUsage {

    public static void main(String... args) {
        Multimap<String, String> multiMap = HashMultimap.create();
        multiMap.put("foo", "bar");
        multiMap.put("foo", "foobar");
        multiMap.put("foo", "fb");
        multiMap.put("hello", "world");

        System.out.println(multiMap);    //{hello=[world], foo=[bar, fb, foobar]}

        Set<String> stringSet = (Set<String>) multiMap.get("foo");
        System.out.println(stringSet);
        stringSet.add("babyduncan");

        System.out.println(multiMap);



    }

}
