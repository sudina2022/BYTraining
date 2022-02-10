package com.by.collections.model;

public class NodeLinkedList<K> {

	private InterfaceNode<K> head;
	private InterfaceNode<K> tail;
	private InterfaceNode<K> prev;
	
	public NodeLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void addNode(InterfaceNode<K> newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			InterfaceNode<K> tempNode = newNode;
			this.tail.setNext(tempNode);
			this.tail = newNode;
		}
	}
	
	public InterfaceNode<K> search(K key){
		InterfaceNode<K> tempNode = head;
		while(tempNode!=null) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	public InterfaceNode<K> findPreviousNode(K Key){
		InterfaceNode<K> currentNode = head;
		while(currentNode.getNext()!=null) {
			if(currentNode.getNext().getKey().equals(Key))
		          return currentNode;
		       else
		    	   currentNode = currentNode.getNext();
		}
		return null;
	}
	
	public void append(InterfaceNode<K> newNode) {
		if(this.head == null) {
			this.head = newNode;
		}
		if(this.tail == null) {
			this.tail = newNode;
		}
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
		@Override
		public String toString() {
			return "My NodeList {"+ head + "}";
		}
		
		
		public void remove(InterfaceNode<K> removeNode) {
			if(this.head.getKey().equals(removeNode.getKey())) {
				this.head = this.head.getNext();
			}
			else if(this.tail == removeNode) {
				InterfaceNode<K> previousNode = findPreviousNode(removeNode.getKey());
				previousNode.setNext(null);
			}
			else {
				InterfaceNode<K> previousNode = findPreviousNode(removeNode.getKey());
				previousNode.setNext(removeNode.getNext());
			}
			
		}
}
