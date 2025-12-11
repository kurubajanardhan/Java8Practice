package com.stream.easy;

import java.util.Arrays;
import java.util.List;

public class CountStartingWithLetterA {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple","Banana","Avocado","Mango","Apricot");
		
		List<String> result = fruits.stream().filter(f -> f.startsWith("A")).toList();
		System.out.println(result);
		
		long resultCount = fruits.stream().filter(f -> f.startsWith("A")).count();
		System.out.println(resultCount);

	}

}
