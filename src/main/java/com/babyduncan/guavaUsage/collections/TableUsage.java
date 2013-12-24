package com.babyduncan.guavaUsage.collections;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/24/13 17:30
 */
public class TableUsage {

    public static void main(String... args) {
        Table<String, String, Integer> weightedGraph = HashBasedTable.create();
        weightedGraph.put("v1", "v2", 4);
        weightedGraph.put("v1", "v3", 20);
        weightedGraph.put("v2", "v3", 5);

        System.out.println(weightedGraph.row("v1")); // returns a Map mapping v2 to 4, v3 to 20
        System.out.println(weightedGraph.column("v3")); // returns a Map mapping v1 to 20, v2 to 5
    }

}
