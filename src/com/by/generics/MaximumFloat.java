package com.by.generics;

public class MaximumFloat {

	public Float getMaxFloat(Float a,Float b,Float c) {
		Float max=a;
		if(max.compareTo(b) < 0) {
			max=b;
		}
		if(max.compareTo(c) < 0) {
			max=c;
		}
		System.out.println("Max is"+max);
		return max;
	}
}
