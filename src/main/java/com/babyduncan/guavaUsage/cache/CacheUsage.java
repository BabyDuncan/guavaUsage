package com.babyduncan.guavaUsage.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/30/13 17:28
 */
public class CacheUsage {

    public static void main(String... args) throws ExecutionException {
        LoadingCache<String, String> cache = CacheBuilder.newBuilder()
                .initialCapacity(100).maximumSize(1000).build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        System.out.println("product one object!!!");
                        return key + "foobar";
                    }
                });

        System.out.println(cache.get("aaa"));
        // from cache
        System.out.println(cache.get("aaa"));
        System.out.println(cache.get("bbb"));

        System.out.println(cache.size());

    }


}
