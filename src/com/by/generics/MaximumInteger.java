package com.by.generics;

public class MaximumInteger {

	public Integer getMaxInt(Integer a,Integer b,Integer c) {
		Integer max=a;
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
