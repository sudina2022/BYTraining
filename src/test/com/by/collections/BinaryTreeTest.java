package test.com.by.collections;

import org.junit.Test;

import com.by.collections.model.BinaryTree;

import org.junit.*;

public class BinaryTreeTest {


	@Test
	public void binaryTreeTest() {
		BinaryTree<Integer> binTree = new BinaryTree();
		binTree.add(56);
		binTree.add(30);
		binTree.add(70);
		int treeSize = binTree.getSize();
		Assert.assertEquals(3,treeSize);
		
		//Use Case 2
		binTree.add(22);
		binTree.add(40);
		binTree.add(11);
		binTree.add(3);
		binTree.add(16);
		binTree.add(70);
		binTree.add(60);
		binTree.add(95);
		binTree.add(65);
		binTree.add(63);
		binTree.add(67);
		treeSize = binTree.getSize();
		Assert.assertEquals(13,treeSize);
		
		//Use Case 3
		Assert.assertTrue(binTree.search(63));
		
		
		
	}
}
