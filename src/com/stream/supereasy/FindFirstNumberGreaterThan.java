package com.stream.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstNumberGreaterThan {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5,7,45,34,13,4,23);
		
		Optional<Integer> result = numbers.stream()
				.filter(n -> n > 40)
				.sorted()
				.findFirst();
		System.out.println(result.get());

	}

}
