package com.by.functioninterface;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumberCheck{
	public static void main(String s) {
		 List<Integer> numbers = Arrays.asList( 2, 3, 4, 5, 6, 7, 8, 9, 20);
		 List<Integer> finalList = numbers.stream()
	                             .filter(PrimeNumberCheck::isPrime)
	                             .collect(Collectors.toList());
		 finalList.forEach((data) -> System.out.println(data));
	    }

	    public static boolean isPrime(int number) {
	        for (int i = 2; i <= number / 2; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
