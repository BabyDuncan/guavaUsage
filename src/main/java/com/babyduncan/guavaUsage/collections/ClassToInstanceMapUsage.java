package com.babyduncan.guavaUsage.collections;

import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/24/13 17:39
 */
public class ClassToInstanceMapUsage {

    public static void main(String... args) {
        ClassToInstanceMap<Number> numberDefaults = MutableClassToInstanceMap.create();
        numberDefaults.putInstance(Integer.class, Integer.valueOf(0));
        numberDefaults.putInstance(Integer.class, Integer.MAX_VALUE);
        System.out.println(numberDefaults.get(Integer.class));

        numberDefaults.putInstance(Long.class, 1l);
        System.out.println(numberDefaults.get(Long.class));

        ClassToInstanceMap<Object> objectClassToInstanceMap = MutableClassToInstanceMap.create();

        objectClassToInstanceMap.putInstance(String.class, "aaa");
        objectClassToInstanceMap.putInstance(Integer.class, 21);

        System.out.println(objectClassToInstanceMap.get(String.class));
        System.out.println(objectClassToInstanceMap.get(Integer.class));


    }

}
