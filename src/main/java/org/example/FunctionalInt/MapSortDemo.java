package org.example.FunctionalInt;

import org.example.reduce.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapSortDemo {
	
	public static void main(String[] args) {
		
		//Map<Employee, Integer> employees = new TreeMap<>(( o1,  o2)-> o1.getSalary()-o2.getSalary());
		Map<Employee, Integer> employees = new HashMap<>();
			
		employees.put(new Employee(7, "Piyush", "It" , 10000),45);
		employees.put(new Employee(5, "Bittu", "It" , 20000),54);
		employees.put(new Employee(9, "Golu", "It" , 5000),34);
		employees.put(new Employee(6, "Chintu", "It" , 250000),67);
		
		//System.out.println(employees);
		
		employees.entrySet().stream()
	    .sorted(Map.Entry.comparingByKey(( o1,  o2)-> o1.getSalary()-o2.getSalary()))
	    .forEach(entry -> System.out.println(entry));
		
		employees.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
		.forEach(System.out::println);
	}
}
