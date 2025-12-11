package com.stream.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LongestWordFinder {

	public static void main(String[] args) {
		
		String sentence = "The quick, brown fox jumped over the lazy dog!";
		
//		Stream<String> result =  Arrays.stream(sentence.toLowerCase().split(" "));
//		result.forEach(System.out::println);
		
//		Stream<String> result =  Arrays.stream(
//				sentence.toLowerCase()
//				.replaceAll("[^a-z\\s]", "")
//				.split(" "));
//		result.forEach(System.out::println);
		
		String result =  Arrays.stream(
					sentence.toLowerCase()
					.replaceAll("[^a-z\\s]", "")
					.split(" "))
				.max(Comparator.comparing(String::length))
				.orElse("");
		System.out.println(result);

	}

}
