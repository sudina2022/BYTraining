package com.by.collections.model;

public class KeyNode<K> implements InterfaceNode<K>{

	private K key;
	private InterfaceNode<K> next;

	public InterfaceNode<K> getNext() {
		return next;
	}

	public void setNext(InterfaceNode<K> next) {
		this.next = next;
	}

	public KeyNode(K key) {
		this.key = null;
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
	
	
}
