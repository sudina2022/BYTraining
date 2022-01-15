package com.by.generics;

public class MaximumString {

	public String getMaxString(String a,String b,String c) {
		String max=a;
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
