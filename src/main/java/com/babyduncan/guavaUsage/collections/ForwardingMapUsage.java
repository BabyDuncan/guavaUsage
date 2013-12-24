package com.babyduncan.guavaUsage.collections;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/24/13 18:34
 */
public class ForwardingMapUsage {

    public static void main(String... args) {
        MyMap mymap = new MyMap();
        mymap.put("a", "b");
        System.out.println(mymap);
    }

}
