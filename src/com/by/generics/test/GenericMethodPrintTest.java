package com.by.generics.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.by.generics.GenericMethodPrint;

public class GenericMethodPrintTest {
	
	@Test
	void testGetMaxInt() {
		Integer firstValue = Integer.valueOf(100);
		Integer secondValue =Integer.valueOf(90);
		Integer thirdValue = Integer.valueOf(80);
    	assertEquals(firstValue,new GenericMethodPrint(firstValue, secondValue, thirdValue).testMaximum());
	}
	
	@Test
	 void testGetMaxFloat() {
		Float firstValue = Float.valueOf("10.67");
		Float secondValue =Float.valueOf("10.07");
		Float thirdValue = Float.valueOf("10.20");
    	assertEquals(firstValue,new GenericMethodPrint(firstValue, secondValue, thirdValue).testMaximum());
	}
	
	@Test
	void testGetMaxString() {
		String firstValue = String.valueOf("Peach");
		String secondValue =String.valueOf("Apple");
		String thirdValue = String.valueOf("Banana");
    	assertEquals(firstValue,new GenericMethodPrint(firstValue, secondValue, thirdValue).testMaximum());
	}

	
}
