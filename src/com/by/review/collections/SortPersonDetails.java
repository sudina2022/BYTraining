package com.by.review.collections;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SortPersonDetails {
	
	public static void main(String[] s) {
		LinkedList<PersonDetails> fullList=new LinkedList<>();
		fullList.add(new PersonDetails("sudina","p","123","blore"));
		fullList.add(new PersonDetails("adhisha","r","123","mysore"));
		fullList.add( new PersonDetails("ram","s","123","kerala"));
		
		List<PersonDetails> sortedDetails = fullList.stream().sorted(Comparator.comparing(PersonDetails::getFirstName))
			        .collect(Collectors.toList());
		
		sortedDetails.forEach((PersonDetails) -> System.out.println(PersonDetails.toString()));
	}

}
