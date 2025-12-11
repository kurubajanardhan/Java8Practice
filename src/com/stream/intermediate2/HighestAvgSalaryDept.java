package com.stream.intermediate2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.stream.intermediate.Employee;

public class HighestAvgSalaryDept {

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
		
//		Map<String, Double> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
//				Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(map);
//		Entry<String, Double> result =  map.entrySet().stream()
//				.max(Map.Entry.comparingByValue()).orElseThrow();
//		System.out.println(result);
		
		
		
		Entry<String, Double> result = employees.stream().collect(Collectors
				.groupingBy(Employee::getDepartment,
				Collectors.averagingDouble(Employee::getSalary))).entrySet().stream()
				.max(Map.Entry.comparingByValue()).orElseThrow();
		System.out.println(result);

	}

}
