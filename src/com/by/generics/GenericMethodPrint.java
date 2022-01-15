package com.by.generics;

public class GenericMethodPrint <T extends Comparable<T>>
{

	T ob1,ob2,ob3;
	
	public GenericMethodPrint(T ob1,T ob2,T ob3) {
		this.ob1=ob1;
		this.ob2=ob2;
		this.ob3=ob3;
	}

	public T testMaximum() {
		return GenericMethodPrint.testMaximum(ob1, ob2, ob3);
	}
		
	public static <T extends Comparable<T>> T testMaximum(T ob1,T ob2,T ob3){
		T max = ob1;
		if(max.compareTo(ob2) < 0) {
			max=ob2;
		}
		if(max.compareTo(ob3) < 0) {
			max=ob3;
		}
		printMaxValue(ob1, ob2, ob3,max);
		return max;
	}
	
	public static <T>  void printMaxValue(T ob1,T ob2,T ob3,T max) {
		System.out.println("\n\n-----Input Values are------");
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		System.out.println("Max of these values is:  "+max);
	}
}

