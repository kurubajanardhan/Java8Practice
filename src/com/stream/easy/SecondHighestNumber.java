package com.stream.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5,10,15,20,25);
		
		Optional<Integer> result = numbers.stream().sorted(Comparator.reverseOrder())
				.skip(1).findFirst();
		System.out.println(result.get());

	}

}
