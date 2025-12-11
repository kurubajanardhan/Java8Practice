package com.stream.intermediate2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MostFrequentChar {

	public static void main(String[] args) {
		
		String input = "banana";
		
//		IntStream chars = input.chars();
//		chars.forEach(System.out::println);
		
//		Stream<Object> chars = input.chars().mapToObj(c -> (char) c);
//		chars.forEach(System.out::println);
		
//		Map<Character, Long> map = input.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(
//						Function.identity(), Collectors.counting()));
//		System.out.println(map);
//		Entry<Character, Long> result = map.entrySet().stream()
//				.max(Map.Entry.comparingByValue()).orElseThrow();
//		System.out.println(result);
		
		Entry<Character, Long> result = input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(
						Function.identity(), 
						Collectors.counting()))
				.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.orElseThrow();
		System.out.println(result);

	}

}
