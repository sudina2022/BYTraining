package com.by.generics.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.by.generics.MaximumInteger;

class MaximumIntegerTest {
	
	

	@Test
	void testGetMaxInt1() {
		Integer firstValue = Integer.valueOf(100);
		Integer secondValue =Integer.valueOf(90);
		Integer thirdValue = Integer.valueOf(80);
    	assertEquals(firstValue,new MaximumInteger().getMaxInt(firstValue,secondValue,thirdValue));
	}
	
	@Test
	 void testGetMaxInt2() {
		Integer firstValue = Integer.valueOf(1);
		Integer secondValue =Integer.valueOf(90);
		Integer thirdValue = Integer.valueOf(80);
    	assertEquals(secondValue,new MaximumInteger().getMaxInt(firstValue,secondValue,thirdValue));
	}
	
	@Test
	void testGetMaxInt3() {
		Integer firstValue = Integer.valueOf(10);
		Integer secondValue =Integer.valueOf(90);
		Integer thirdValue = Integer.valueOf(800);
    	assertEquals(thirdValue,new MaximumInteger().getMaxInt(firstValue,secondValue,thirdValue));
	}

	

}
