package com.stream.hard2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCharacters {

	public static void main(String[] args) {
		
		List<Character> chars = Arrays.asList(
				'A','b','3','Z','x','#','7','m','%'
				);
		Map<Object, List<Character>> result = chars.stream()
			.collect(Collectors.groupingBy(
					ch -> getCharCategory(ch.charValue())
					));
		System.out.println(result);
	}

	private static Object getCharCategory(char charValue) {
		if(Character.isUpperCase(charValue)) return CharCategory.UPPERCASE;
		if(Character.isLowerCase(charValue)) return CharCategory.LOWERCASE;
		if(Character.isDigit(charValue)) return CharCategory.DIGIT;
		return CharCategory.OTHER ;
	}

}
