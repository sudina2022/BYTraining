package com.by.collections.model;

import java.util.ArrayList;

public class LinkedHashMap<K,V> {

	private final int noOfBuckets;
	ArrayList <NodeLinkedList<K>> myArrayBucket;
	
	public LinkedHashMap() {
		this.noOfBuckets = 10;
		this.myArrayBucket = new ArrayList<>(noOfBuckets);
		
		for(int i=0;i<noOfBuckets;i++) {
			this.myArrayBucket.add(null);
		}
	}
		
		public V get(K key) {
			int index = this.getBucketIndex(key);
			NodeLinkedList<K> myLinkedList = this.myArrayBucket.get(index);
			if(myLinkedList == null)
				return null;
			KeyValueNode<K,V> mapNode = (KeyValueNode<K,V>)myLinkedList.search(key);
			return((mapNode==null)? null: mapNode.getValue());
		}

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % noOfBuckets;
		return index;
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		NodeLinkedList<K> myLinkedList = this.myArrayBucket.get(index);
		if(myLinkedList == null)
		{
			myLinkedList = new NodeLinkedList<>();
			this.myArrayBucket.set(index, myLinkedList);
		}
		KeyValueNode<K,V> mapNode = (KeyValueNode<K,V>)myLinkedList.search(key);
		if(mapNode==null) {
			mapNode = new KeyValueNode<>(key, value);
			myLinkedList.append(mapNode);
		}else {
			mapNode.setValue(value);
		}
	}
	
	@Override
	public String toString() {
		return (""+myArrayBucket);
	}

	public boolean remove(K key) {
		int index = this.getBucketIndex(key);
		NodeLinkedList<K> myLinkedList = this.myArrayBucket.get(index);
		if(myLinkedList == null)
			return false;
		else
		{
			KeyValueNode<K,V> mapNode = (KeyValueNode<K,V>)myLinkedList.search(key);
			if(mapNode==null) {
				return false;
			}
			else {
				myLinkedList.remove(mapNode);
				return true;
			}
		}
	}	
}
