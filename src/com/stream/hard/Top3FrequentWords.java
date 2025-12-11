package com.stream.hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Top3FrequentWords {

	public static void main(String[] args) {
		
		String paragraph = "Java is great great, Java is object oriented, Java streams are powerful, and Java is fun.";
		
//		Stream<String> result =  Arrays.stream(
//				paragraph.toLowerCase()
//				.replaceAll("[^a-z\\s]", "")
//				.split(" "));
//		result.forEach(System.out::println);
		
//		Map<String, Long> map =  Arrays.stream(
//					paragraph.toLowerCase()
//					.replaceAll("[^a-z\\s]", "")
//					.split(" "))
//				.collect(Collectors.groupingBy(
//						Function.identity(),
//						Collectors.counting()));
//		System.out.println(map);
//		List<Entry<String, Long>> result = map.entrySet().stream()
//				.sorted(Map.Entry.<String,Long>comparingByValue().reversed())
//				.limit(3)
//				.toList();
//		System.out.println(result);
		
		Map<String, Long> map =  Arrays.stream(
				paragraph.toLowerCase()
				.replaceAll("[^a-z\\s]", "")
				.split(" "))
			.collect(Collectors.groupingBy(
					Function.identity(),
					Collectors.counting()));
		System.out.println(map);
		List<Entry<String, Long>> sorted = map.entrySet().stream()
				.sorted(Map.Entry.<String,Long>comparingByValue().reversed())
				.toList();
		System.out.println(sorted);
		List<Long> topFrequency = sorted.stream()
				.map(Map.Entry::getValue)
				.distinct()
				.limit(3)
				.toList();
		System.out.println(topFrequency);
		List<Entry<String, Long>> result = sorted.stream()
				.filter(e -> topFrequency.contains(e.getValue()))
				.toList();
		System.out.println(result);
		

	}

}
