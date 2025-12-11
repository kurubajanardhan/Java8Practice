package com.stream.intermediate;

import java.util.Arrays;
import java.util.List;

public class AverageAgeExample {

	public static void main(String[] args) {
		
		List<PersonDTO> persons = Arrays.asList(
				new PersonDTO("Alice", 25),
				new PersonDTO("Bob", 30),
				new PersonDTO("Charlie", 28),
				new PersonDTO("David", 35)
		);
		
		double avg =  persons.stream()
			.mapToInt(PersonDTO::getAge).average().orElse(0.0);
		System.out.println(avg);

	}

}
