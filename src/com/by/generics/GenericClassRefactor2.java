package com.by.generics;

public class GenericClassRefactor2 <T extends Comparable<T>>
{
	T ob1,ob2,ob3;
	
	public GenericClassRefactor2(T ob1,T ob2,T ob3) {
		this.ob1=ob1;
		this.ob2=ob2;
		this.ob3=ob3;
	}

	public T testMaximum() {
		return GenericClassRefactor2.testMaximum(ob1, ob2, ob3);
	}
		
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

