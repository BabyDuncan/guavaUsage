package com.babyduncan.guavaUsage.collections;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.HashMap;
import java.util.Map;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/24/13 11:25
 */
public class ImmutableCollectionsUsage {

    public static void main(String... args) {
        final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "purple");

        System.out.println(COLOR_NAMES);
//        COLOR_NAMES.remove("red");    //Exception in thread "main" java.lang.UnsupportedOperationException
//        System.out.println(COLOR_NAMES);

        Map<String, String> map = new HashMap<String, String>();
        map.put("foo", "bar");
        map.put("ok", "nice");
        // use copy of to construct one immutableMap
        ImmutableMap<String, String> immutableMap = ImmutableMap.copyOf(map);
        System.out.println(immutableMap);
//        immutableMap.put("a","b");   unsupported method

        //use of to construct one immutable list
        ImmutableList<String> immutableList = ImmutableList.of("Hello", "ok", "nice");
        System.out.println(immutableList);

        //use builder to construct one immutable Set
        ImmutableSet<String> COLOR_NAMES_NEW = ImmutableSet.<String>builder().addAll(COLOR_NAMES).add("new_color").build();
        System.out.println(COLOR_NAMES_NEW);


    }

}
