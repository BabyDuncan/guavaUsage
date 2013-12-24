package com.babyduncan.guavaUsage.collections;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.Maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * User: guohaozhao (guohaozhao116008@sohu-inc.com)
 * Date: 12/24/13 18:35
 */
public class MyMap extends ForwardingMap<String, String> {

    final Map<String, String> delegate = Maps.newConcurrentMap();

    protected MyMap() {
        super();
    }

    @Override
    protected Map<String, String> delegate() {
        return delegate;
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String remove(Object object) {
        return super.remove(object);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return super.containsValue(value);
    }

    @Override
    public String get(Object key) {
        return super.get(key);
    }

    @Override
    public String put(String key, String value) {
        System.out.println("put " + key + " value " + value);
        return super.put(key, value);
    }

    @Override
    public void putAll(Map<? extends String, ? extends String> map) {
        super.putAll(map);
    }

    @Override
    public Set<String> keySet() {
        return super.keySet();
    }

    @Override
    public Collection<String> values() {
        return super.values();
    }

    @Override
    public Set<Entry<String, String>> entrySet() {
        return super.entrySet();
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void standardPutAll(Map<? extends String, ? extends String> map) {
        super.standardPutAll(map);
    }

    @Override
    protected String standardRemove(Object key) {
        return super.standardRemove(key);
    }

    @Override
    protected void standardClear() {
        super.standardClear();
    }

    @Override
    protected boolean standardContainsKey(Object key) {
        return super.standardContainsKey(key);
    }

    @Override
    protected boolean standardContainsValue(Object value) {
        return super.standardContainsValue(value);
    }

    @Override
    protected boolean standardIsEmpty() {
        return super.standardIsEmpty();
    }

    @Override
    protected boolean standardEquals(Object object) {
        return super.standardEquals(object);
    }

    @Override
    protected int standardHashCode() {
        return super.standardHashCode();
    }

    @Override
    protected String standardToString() {
        return super.standardToString();
    }
}
