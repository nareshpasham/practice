package com.practice.java8features.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Function01 {

	final static Logger logger = LoggerFactory.getLogger(Function01.class);

	public static void main(String[] args) {
		// String as arg and print length of string
		Function<String, Integer> strLength = s -> s.length();
		Function<String, String> strUpprCase = s -> s.toUpperCase();
		List<String> nameList = Arrays.asList("Naragjuna", "Shivaji Raje", "maharana pratap");
		for (String name : nameList) {
			logger.info("Names:{}, Length:{}" ,strUpprCase.apply(name) , strLength.apply(name));
		}
		/*
		 * Student grade finding
		 */
		Function<Student,Integer> marks=s->s.getTotalMarks()/s.getNoOfSubjects();
		Function<Student,String> gradeFunction=s->marks.apply(s)>80?"A":(marks.apply(s)>60 && marks.apply(s)<80)?"B":(marks.apply(s)>35 && marks.apply(s)<60)?"C":"E";
		List<Student> students=new ArrayList<>();
		students.add(new Student("Naresh",446,6));
		students.add(new Student("Mahesh",566,6));
		students.add(new Student("Rajesh",356,6));
		students.add(new Student("Praveen",150,6));
		
		for (Student student : students) {
			logger.info("*********************************************");
			logger.info("Grade secured by {}, is {}",student.getName(),gradeFunction.apply(student));
			logger.info("*********************************************");
			
		}
		Consumer<Student> c=s->{
			logger.info("****************CONSUMER******STARTS***********************");
			logger.info("Grade secured by {}, is {}",s.getName(),gradeFunction.apply(s));
			logger.info("***************CONSUMER******ENDS************************");
			
		};
		for (Student student : students) {
			c.accept(student);
		}
		
		//Supplier doesnt take any parameter but returns a value.
		Supplier<Date> s =()-> {return new Date(System.currentTimeMillis());};
		logger.info("Current Date & Time {}",s.get());
		
		//Generating the random integer via suppliers
		Supplier<Integer> supRandom=()->{
			Random num=new Random();
			return num.nextInt(10000);
		};
		logger.info("Random Number Generation  {}",supRandom.get());
	}

}
