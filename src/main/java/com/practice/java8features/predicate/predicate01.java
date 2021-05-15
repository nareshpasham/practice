package com.practice.java8features.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class predicate01 {

	final static Logger logger=LoggerFactory.getLogger(predicate01.class);
	public static void main(String[] args) {
		Predicate<Integer> evenNumber=i->i%2==0;
		logger.info("Even number {}",evenNumber.test(10));
		logger.info("Even number {}",evenNumber.test(15));
		Predicate<Employee> emp=e->e.getAge()>30 && e.getEmpName().startsWith("s");
		logger.info("Employee conditions satisfy {}",emp.test(new Employee("suresh",1,"Lhouse",35)));
		Predicate<Employee> e1=emp.and(e->e.getEmpAddress().equals("Lhouse"));
		logger.info("Employee conditions satisfy {}",e1.test(new Employee("suresh",1,"Lhouse",35)));
		logger.info("Employee conditions satisfy {}",emp.test(new Employee("Naresh",2,"Lhouse",25)));
		
		//predicate to check the length of the string is >5 or not.
		Predicate<String> predStr=s->s.length()>5;
		logger.info("Length of the String is greater than 5  {}",predStr.test("Shri Sanvi"));
		String[] arrayStr= {"Venkat","Pavan","Chiru","Katrina"};
		for (String element : arrayStr) {
			logger.info("*****Length of the String is greater than 5  {}",predStr.test(element));
			if(predStr.test(element))
				System.out.println(element);
		}
		
		List<Employee> employees= new ArrayList<>();
		employees.add(new Employee("Mahesh", 1, "Nampally",40));
		employees.add(new Employee("Ramesh", 11, "Nampally",20));
		employees.add(new Employee("Kishan", 21, "Nampally",24));
		employees.add(new Employee("Sameer", 13, "Nampally",54));
		employees.add(new Employee("Parameshwar", 41, "Nampally",36));
		employees.add(new Employee("Kiran", 7, "Nampally",44));
		Predicate<Employee> preEmployee=e->e.getAge()>35;
		for (Employee employee : employees) {
			
			if(/*!preEmployee.test(employee)*/preEmployee.negate().test(employee)) {
				logger.info("*****elements that doesnt satisy  {}",employee);
			}
		}
		employees.stream().forEach(System.out::println);
		
		
	}

}
