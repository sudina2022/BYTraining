package com.by.collections.model;

public class KeyValueNode<K,V> implements InterfaceNode<K> {

	K key;
	V value;
	KeyValueNode<K,V> next;
	
	public KeyValueNode(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	@Override
	public InterfaceNode<K> getNext() {
		return next;
	}

	@Override
	public void setNext(InterfaceNode<K> next) {
		this.next = (KeyValueNode<K, V>) next;
	}

	
	@Override
	public String toString() {
		StringBuilder strString = new StringBuilder();
		strString.append("KeyValueNode{"+"K=").append(key)
				.append("\tValue=").append(value).append("}");
		if(next!=null)
			strString.append("->").append(next);
		return strString.toString();
	}
}
