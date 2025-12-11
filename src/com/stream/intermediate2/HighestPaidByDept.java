package com.stream.intermediate2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.stream.intermediate.Employee;

public class HighestPaidByDept {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee(1, "John", "HR", 50000),
				new Employee(2, "Jane", "IT", 70000),
				new Employee(3, "Mike", "IT", 80000),
				new Employee(4, "Sara", "Finance", 60000),
				new Employee(5, "Paul", "HR", 55000)
		);
		
//		Map<String, List<Employee>> result = employees.stream()
//				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
//		System.out.println(result);
		
		Map<String, Optional<Employee>> result = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		System.out.println(result);

	}

}
