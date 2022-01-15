package com.by.generics;

public class GenericMethodRefactor1 {

	public static <T extends Comparable<T>> T testMaximum(T ob1,T ob2,T ob3){
		T max = ob1;
		if(max.compareTo(ob2) < 0) {
			max=ob2;
		}
		if(max.compareTo(ob3) < 0) {
			max=ob3;
		}
		System.out.println("Max is"+max);
		return max;
	}
}
