package com.stream.easy;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class FindAverage {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5,10,15,20,25);
		
		OptionalDouble avg = numbers.stream()
			.mapToInt(Integer::intValue)
			.average();
		System.out.println(avg.getAsDouble());
		
//		double avg = numbers.stream()
//				.mapToInt(Integer::intValue)
//				.average()
//				.orElse(0.0);
//		System.out.println(avg);

	}

}
