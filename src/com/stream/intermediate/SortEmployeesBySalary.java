package com.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalary {

	public static void main(String[] args) {

		List<EmployeeDTO> employees = Arrays.asList(
				new EmployeeDTO(101, "John", 500000),
				new EmployeeDTO(102, "Alice", 700000),
				new EmployeeDTO(103, "Bob", 450000),
				new EmployeeDTO(104, "David", 900000)
		);
		
		List<EmployeeDTO> listAscending = employees.stream()
				.sorted(Comparator.comparing(EmployeeDTO::getSalary)).toList();
		System.out.println(listAscending);
		
		List<EmployeeDTO> listDescending = employees.stream()
				.sorted(Comparator.comparing(EmployeeDTO::getSalary).reversed()).toList();
		System.out.println(listDescending);

	}

}
