package com.stream.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstNonEmptyString {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("","","Banana","Avocado","","Apricot");
		
		Optional<String> result = fruits.stream().filter(s -> !s.isEmpty()).findFirst();
		System.out.println(result.get());

	}

}
