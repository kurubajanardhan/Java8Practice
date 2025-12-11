package com.stream.easy;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5,9,15,20,24);
		boolean result = numbers.stream().anyMatch(n -> n%3 == 0);
		System.out.println(result);
		
		List<Integer> numbers1 = Arrays.asList(5,10,16,20,25);
		boolean result1 = numbers1.stream().anyMatch(n -> n%3 == 0);
		System.out.println(result1);

	}

}
