package com.stream.hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SlidingWindowAvg {

	public static void main(String[] args) {
		
		List<Integer> input = Arrays.asList(4,8,15,16,23,42);
		
//		List<Double> result = IntStream.range(0, input.size()-2)
//				.mapToObj(i -> (input.get(i)+input.get(i+1)+input.get(i+2))/3.0)
//				.toList();
//		System.out.println(result);
		
//		int window = 4;
//		List<Integer> result = IntStream.range(0, input.size()-(window - 1))
//				.mapToObj(i -> (input.get(i)+input.get(i+1)+input.get(i+2)+input.get(i+3))/window)
//				.toList();
//		System.out.println(result);
		
//		double window = 4;
//		List<Double> result = IntStream.range(0, (int) (input.size()-(window - 1)))
//				.mapToObj(i -> (input.get(i)+input.get(i+1)+input.get(i+2)+input.get(i+3))/window)
//				.toList();
//		System.out.println(result);
		
//		int window = 4;
//		List<List<Integer>> result = IntStream.range(0, input.size()-(window - 1))
//				.mapToObj(i -> input.subList(i, i + window))
//				.toList();
//		System.out.println(result);
		
		int window = 2;
		List<Double> result = IntStream.range(0, input.size()-(window - 1))
				.mapToObj(i -> input.subList(i, i + window))
				.map(w -> w.stream()
						.mapToInt(Integer::intValue)
						.average()
						.orElse(0.0))
				.toList();
		System.out.println(result);


	}

}
