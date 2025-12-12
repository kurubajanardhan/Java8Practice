package com.stream.hard2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesWith3Departments {

	public static void main(String[] args) {
		
		List<WorkRecord> records = List.of(
				new WorkRecord("John", "IT"),
				new WorkRecord("John", "Finance"),
				new WorkRecord("John", "HR"),
				new WorkRecord("Alice", "IT"),
				new WorkRecord("Alice", "HR"),
				new WorkRecord("Bob", "Finance"),
				new WorkRecord("David", "IT"),
				new WorkRecord("David", "Finance"),
				new WorkRecord("David", "HR"),
				new WorkRecord("David", "Admin")
				);
//		Map<String, List<WorkRecord>> collect = records.stream()
//				.collect(Collectors.groupingBy(WorkRecord::getName));
//		System.out.println(collect);
		
		Map<String, List<WorkRecord>> collect = records.stream()
				.collect(Collectors.groupingBy(WorkRecord::getName));
		List<String> result = collect.entrySet().stream()
			.filter(entry -> entry.getValue().size() >= 3)
			.map(Map.Entry::getKey).toList();
		System.out.println(result);
	}

}
