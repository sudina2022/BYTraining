package com.by.collections.model;

public class NodeHashMap<K,V> {
	
	NodeLinkedList<K> nodeList;

	public NodeHashMap() {
		this.nodeList = new NodeLinkedList<>();
	}
	public NodeHashMap(NodeLinkedList<K> nodeList) {
		this.nodeList = nodeList;
	}

	public V get(K key) {
		KeyValueNode<K,V> mapNode = (KeyValueNode<K,V>)this.nodeList.search(key);
		return((mapNode==null)? null: mapNode.getValue());
	}
	
	public void add(K key,V value) {
		KeyValueNode<K,V> mapNode = (KeyValueNode<K,V>)this.nodeList.search(key);
		if(mapNode == null) {
			mapNode = new KeyValueNode<K, V>(key, value);
			this.nodeList.addNode(mapNode);
		}
		else
			mapNode.setValue(value);
	}
	
	@Override
	public String toString() {
		return "Final Map of Lists{"+ nodeList +"}";
	}
}
