package com.stream.hard2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryRangeGrouping {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee("Alice", 45000),
				new Employee("Bob", 78000),
				new Employee("Charlie", 120000),
				new Employee("David", 99000),
				new Employee("Eve", 30000),
				new Employee("Frank", 105000)
				);
		
//		Map<Object, List<Employee>> collect = employees.stream()
//			.collect(Collectors.groupingBy(
//					e -> {
//						if(e.getSalary()<50000) return SalaryRange.LOW;
//						if(e.getSalary()<100000) return SalaryRange.MEDIUM;
//						else return SalaryRange.HIGH;
//					}
//			 ));
//		System.out.println(collect);
		
		//        (or)
		
		Map<Object, List<Employee>> collect = employees.stream()
				.collect(Collectors.groupingBy(
						e -> getSalaryrange(e.getSalary())
				 ));
			System.out.println(collect);
	}

	private static SalaryRange getSalaryrange(Double salary) {
		if(salary<50000) return SalaryRange.LOW;
		if(salary<100000) return SalaryRange.MEDIUM;
		else return SalaryRange.HIGH;
	}

}
