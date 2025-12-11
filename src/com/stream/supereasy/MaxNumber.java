package com.stream.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
//		Integer maxValue = numbers.stream().reduce(0,(a,b)-> Integer.max(a, b));
		Integer maxValue = numbers.stream().reduce(0, Integer::max);
		System.out.println(maxValue);
		
		//or
		
		Optional<Integer> maxValue1 = numbers.stream().reduce(Integer::max);
		System.out.println(maxValue1.get());

	}

}
