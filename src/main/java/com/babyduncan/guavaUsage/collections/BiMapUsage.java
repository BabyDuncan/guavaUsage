package com.babyduncan.guavaUsage.collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/24/13 17:06
 * BiMap is bidirectional map
 * it can convert itself from kv to vk
 */
public class BiMapUsage {

    public static void main(String... args) {
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("foo", "bar");
        System.out.println(biMap.get("foo"));  //bar
        biMap = biMap.inverse();
        System.out.println(biMap.get("bar"));  //foo
    }

}
