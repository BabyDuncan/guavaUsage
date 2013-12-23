package com.babyduncan.guavaUsage.basic;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/23/13 18:02
 */
public class ComparisonChainUsage {

    public static void main(String... args) {
        Book b = new Book("BabyDuncan", "ok", 12);
        Book c = new Book("BabyDuncan", "ok", 12);
        Book d = new Book("James", "foobarß", 12);
        // 0 means equals and 1 means not equals
        // 三个参数得compare 第三个参数是指定comparator
        System.out.println(ComparisonChain.start().compare(b.author, c.author, Ordering.natural().nullsLast()).compare(b.price, c.price).result());
        System.out.println(ComparisonChain.start().compare(b.author, d.author, Ordering.natural().nullsLast()).compare(b.price, d.price).result());
    }

}
