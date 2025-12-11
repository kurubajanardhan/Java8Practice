package com.stream.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringUsingDelimiter {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple","Banana","Avocado","Mango","Orange");
		
		String result = fruits.stream().collect(Collectors.joining());
		System.out.println(result);
		
		String result1 = fruits.stream().collect(Collectors.joining(","));
		System.out.println(result1);
		
		String result2 = fruits.stream().collect(Collectors.joining(",", "{", "}"));
		System.out.println(result2);
	
	}

}
