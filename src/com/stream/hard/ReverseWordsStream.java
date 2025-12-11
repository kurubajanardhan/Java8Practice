package com.stream.hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsStream {

	public static void main(String[] args) {
		
		String sentence = "Java streams are powerful";
		
//		String result = Arrays.stream(sentence.split(" "))
//				.map(word -> new StringBuilder(word).reverse().toString())
//				.collect(Collectors.joining(" "));
//		System.out.println(result);
		
		String result = Arrays.stream(sentence.split(" "))
				.map(word -> Arrays.stream(word.split(""))
						.reduce("", (rev,ch) -> ch + rev))
				.collect(Collectors.joining(" "));
		System.out.println(result);

	}

}
