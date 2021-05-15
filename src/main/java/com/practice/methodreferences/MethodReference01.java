package com.practice.methodreferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference01 {

	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(1250,1550,2000,1010,990,340,2300,250);
//		numbers.stream().sorted()
		Comparator<Integer> numComp=(e1,e2)-> (e1<e2)?1:(e1>e2)?-1:0;
//		Collections.sort(numbers,numComp);
		System.out.println(numbers);
		System.out.println("Index of="+numbers.indexOf(1));
		System.out.println("Get method="+numbers.get(1));
		List sortedList=numbers.stream().sorted((e1,e2)-> (e1<e2)?1:(e1>e2)?-1:0).collect(Collectors.toList());
		System.out.println("-----"+sortedList);
		System.out.println("-----"+sortedList.get(1));
		Integer secondHighSal=numbers.stream().sorted().collect(Collectors.toList()).get(1);
		System.out.println("Second highest="+secondHighSal);
		
		

	}

}
