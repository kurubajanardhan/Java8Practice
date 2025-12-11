package com.stream.intermediate2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharStream {

	public static void main(String[] args) {
		
		String input = "swiss";
		
//		Map<Character, Long> map = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
//				Function.identity(), Collectors.counting()));
//		System.out.println(map);
		
//		Optional<Entry<Character, Long>> result = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(
//				Function.identity(), Collectors.counting()))
//				.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();
//		System.out.println(result.get());
		
		Optional<Entry<Character, Long>> result = input.chars()
				.mapToObj(c -> (char) c).collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new, 
						Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();
		System.out.println(result.get());

	}

}
