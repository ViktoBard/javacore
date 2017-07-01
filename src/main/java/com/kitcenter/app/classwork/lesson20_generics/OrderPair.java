package com.kitcenter.app.classwork.lesson20_generics;

/**
 * Created by Viktor on 01.07.2017.
 */
public class OrderPair<K, V> {
    private K key;
    private V value;

    public OrderPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}