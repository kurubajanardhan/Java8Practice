package com.stream.hard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.stream.intermediate.Employee;

public class MostCommonFirstLetter {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee(1, "John", "HR", 50000),
				new Employee(2, "Jane", "IT", 70000),
				new Employee(3, "Mike", "IT", 80000),
				new Employee(4, "Sara", "Finance", 60000),
				new Employee(5, "Paul", "HR", 55000),
				new Employee(6, "Alice", "IT", 90000),
				new Employee(7, "Carol", "Finance", 65000),
				new Employee(8, "David", "Operations", 44000)
		);
		
//		Map<Character, Long> map = employees.stream()
//				.map(e -> e.getName().charAt(0))
//				.collect(Collectors.groupingBy(
//						Function.identity(),
//						Collectors.counting()));
//		System.out.println(map);
//		Optional<Entry<Character, Long>> result = map.entrySet().stream()
//				.max(Map.Entry.comparingByValue());
//		System.out.println(result.get());
		
		Optional<Entry<Character, Long>> result = employees.stream()
				.map(e -> e.getName().charAt(0))
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()))
				.entrySet().stream()
				.max(Map.Entry.comparingByValue());
		System.out.println(result.get());

	}

}
