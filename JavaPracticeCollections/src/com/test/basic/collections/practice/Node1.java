package com.test.basic.collections.practice;

class Node1<K, V> {
	public final K key;
	public final V value;

	public Node1(K key, V value) {
		super();
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
