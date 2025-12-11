package com.stream.intermediate2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.stream.intermediate.Employee;

public class DepartmentEmployeeCount {

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
		
//		Map<String, Long> result = employees.stream().collect(Collectors.groupingBy( Employee::getDepartment,
//				Collectors.counting()));
//		System.out.println(result);
		
//		Map<String, Long> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//				Collectors.counting()));
//		List<Entry<String, Long>> result =  map.entrySet().stream()
//				.filter(e -> e.getValue() > 2).toList();
//		System.out.println(result);
		
//		Map<String, Long> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//				Collectors.counting()));
//		List<String> result =  map.entrySet().stream()
//				.filter(e -> e.getValue() > 2).map(Map.Entry::getKey).toList();
//		System.out.println(result);
		
		List<String> result = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 2).map(Map.Entry::getKey).toList();
		System.out.println(result);
		

	}

}
