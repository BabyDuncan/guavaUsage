package com.babyduncan.guavaUsage.collections;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/24/13 14:51
 * 元素可以重复的set
 */
public class MultisetUsage {

    public static void main(String... args) {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("foobar");
        multiset.add("helloworld");
        multiset.add("foobar");

        System.out.println(multiset.count("foobar"));          //2
        System.out.println(multiset.contains("helloworld"));   //true
        System.out.println(multiset.size());                   //3
        System.out.println(multiset.elementSet().size());      //2


    }

}
