package com.by.generics.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.by.generics.MaximumFloat;

class MaximumFloatTest {
	
	

	@Test
	public void testGetMaxFloat1() {
		Float firstValue = Float.valueOf("10.67");
		Float secondValue =Float.valueOf("10.07");
		Float thirdValue = Float.valueOf("10.20");
    	assertEquals(firstValue,new MaximumFloat().getMaxFloat(firstValue,secondValue,thirdValue));
	}
	
	@Test
	 public void testGetMaxFloat2() {
		Float firstValue = Float.valueOf("10.67");
		Float secondValue =Float.valueOf("10.78");
		Float thirdValue = Float.valueOf("10.20");
    	assertEquals(secondValue,new MaximumFloat().getMaxFloat(firstValue,secondValue,thirdValue));
	}
	
	@Test
	public void testGetMaxFloat3() {
		Float firstValue = Float.valueOf("10.67");
		Float secondValue =Float.valueOf("10.78");
		Float thirdValue = Float.valueOf("10.90");
    	assertEquals(thirdValue,new MaximumFloat().getMaxFloat(firstValue,secondValue,thirdValue));
	}

	

}
