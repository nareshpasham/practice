package com.practice.java8features.lamdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortGivenNumber {
	
	public static void main(String[] args) {
		List<Integer> numberList=new ArrayList<>();
		numberList.add(160);
		numberList.add(1);
		numberList.add(150);
		numberList.add(40);
		numberList.add(101);
		numberList.add(5);
		System.out.println(numberList);
		Comparator<Integer> intCompare=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0; 
		Collections.sort(numberList,intCompare);
		System.out.println(numberList);
		numberList.stream().filter(i->i%2==0).collect(Collectors.toList());//(System.out::println);
		List<String> strList=new ArrayList<>();
		strList.add("Bat");
		strList.add("Cat");
		strList.add("Apple");
		strList.add("Snake");
		strList.add("Zebra");
		strList.add("Monkey");
		strList.add("Monster");
		System.out.println(strList);
//		Collections.sort(strList);
//		Collections.sort(strList, new MyComparator());
		Comparator<String> str=(o1,o2)->{return o1.compareTo(o2);};
		Collections.sort(strList, str);
		System.out.println(strList);
		Collections.reverse(strList);
		System.out.println(strList);
		strList.stream().forEach(System.out::println);
	}

}
