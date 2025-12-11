package com.stream.supereasy;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,4,6,8);
		
		Integer sum = numbers.stream().reduce(0,(a,b)-> a+b);
		System.out.println(sum);
		
		Integer product = numbers.stream().reduce(1,(a,b)-> a*b);
		System.out.println(product);

	}

}
