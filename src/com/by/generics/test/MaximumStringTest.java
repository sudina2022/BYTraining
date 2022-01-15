package com.by.generics.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.by.generics.MaximumString;

class MaximumStringTest {
	
	

	@Test
	void testGetMaxString1() {
		String firstValue = String.valueOf("Peach");
		String secondValue =String.valueOf("Apple");
		String thirdValue = String.valueOf("Banana");
    	assertEquals(firstValue,new MaximumString().getMaxString(firstValue,secondValue,thirdValue));
	}
	
	@Test
	 void testGetMaxString2() {
		String firstValue = String.valueOf("Apple");
		String secondValue =String.valueOf("Peach");
		String thirdValue = String.valueOf("Banana");
		assertEquals(secondValue,new MaximumString().getMaxString(firstValue,secondValue,thirdValue));
	}
	
	@Test
	void testGetMaxString3() {
		String firstValue = String.valueOf("Apple");
		String secondValue =String.valueOf("Banana");
		String thirdValue = String.valueOf("Peach");
		assertEquals(thirdValue,new MaximumString().getMaxString(firstValue,secondValue,thirdValue));
	}

	

}
