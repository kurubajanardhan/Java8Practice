package com.stream.easy;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5,10,15,20,25);
		boolean result = numbers.stream().allMatch(n -> n > 0);
		System.out.println(result);
		
		List<Integer> numbers1 = Arrays.asList(5,10,-15,20,25);
		boolean result1 = numbers1.stream().allMatch(n -> n > 0);
		System.out.println(result1);

	}

}
