package com.stream.supereasy;

import java.util.Arrays;
import java.util.List;

public class CountGreaterThan {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,7,45,34,13,4,23,7,7);
		
		Long count = numbers.stream().filter(n -> n > 5).distinct().count();
		System.out.println(count);

	}

}
