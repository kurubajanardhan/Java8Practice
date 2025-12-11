package com.stream.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDistinctElements {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,3,2,3,4,4,6,7,1,9,7);
		
		//numbers.stream().distinct().forEach(System.out::println); 
		
//		List<Integer> values = numbers.stream().distinct().toList();
//		System.out.println(values);
		
		List<Integer> values = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(values);

	}

}
