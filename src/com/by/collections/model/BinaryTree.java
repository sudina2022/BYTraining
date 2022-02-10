package com.by.collections.model;

public class BinaryTree<K extends Comparable<K>> {

	private BinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root,key);
	}
	
	public boolean search(K key) {
		this.root = this.searchRecursively(root, key);
		if(root == null)
			return false;
		return true;
	}
	private BinaryNode<K> addRecursively(BinaryNode<K> current, K key){
		if(current == null)
			return new BinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0)
			return current;
		if(compareResult < 0) {
			current.left = addRecursively(current.left, key);
		}else { 
			current.right = addRecursively(current.right, key);
		}
		return current;
	}
	
	public int getSize() {
		return this.getSizeRecursively(root);
	}
	
	private int getSizeRecursively(BinaryNode<K> current) {
		return current == null? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
	}
	
	private BinaryNode<K> searchRecursively(BinaryNode<K> current, K key){
		if(current == null)
			return null;
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0)
			return current;
		if(compareResult < 0) {
			current = searchRecursively(current.left, key);
			System.out.println("Left - "+current);
		}else { 
			current = searchRecursively(current.right, key);
			System.out.println("Right - "+current);
		}
		return current;
	}
	
}
