package com.by.collections.model;

public interface InterfaceNode<K> {
	
	K getKey();
	void setKey(K key);
	
	InterfaceNode<K> getNext();
	void setNext(InterfaceNode<K> next);

}
