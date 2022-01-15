package com.by.generics.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.by.generics.GenericMethodRefactor1;

public class GenericMethodRefactor1Test {

	@Test
	void testGetMaxInt() {
		Integer firstValue = Integer.valueOf(10);
		Integer secondValue =Integer.valueOf(90);
		Integer thirdValue = Integer.valueOf(80);
    	assertEquals(secondValue,new GenericMethodRefactor1().testMaximum(firstValue, secondValue, thirdValue));
	}
	
	@Test
	 void testGetMaxFloat() {
		Float firstValue = Float.valueOf("10.17");
		Float secondValue =Float.valueOf("10.97");
		Float thirdValue = Float.valueOf("10.20");
    	assertEquals(secondValue,new GenericMethodRefactor1().testMaximum(firstValue, secondValue, thirdValue));
	}
	
	@Test
	void testGetMaxString() {
		String firstValue = String.valueOf("Apple");
		String secondValue =String.valueOf("Peach");
		String thirdValue = String.valueOf("Banana");
    	assertEquals(secondValue,new GenericMethodRefactor1().testMaximum(firstValue, secondValue, thirdValue));
	}

}
