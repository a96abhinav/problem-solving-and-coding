package com.java.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		Collections.sort(employeeList, Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary));

		employeeList.forEach(employee -> {
			System.out.println(employee.getDepartment() + " => " + employee.getSalary());
		});

		System.out.println();

		Map<String, Double> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.toList(), employees -> {

			Employee e = ((Collection<Employee>) employees).stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().orElse(new Employee(0, null, 0, null, null, 0, 0));

			return e.getSalary();
		})));

		System.out.println(map);

		System.out.println();

		Map<String, Double> employeeWithMaxSalaryInEachDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), employee -> employee.map(Employee::getSalary).get())));

		employeeWithMaxSalaryInEachDepartment.entrySet().stream().forEach(e -> {
			System.out.println(e);
		});

		System.out.println("========================");
		Map<String, Double> employeeWithSecondHighestSalaryInEachDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getSalary, Collectors.collectingAndThen(Collectors.toList(), salaries -> salaries.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get()))));

		employeeWithSecondHighestSalaryInEachDepartment.entrySet().stream().forEach(e -> {
			System.out.println(e);
		});
		System.out.println();


		System.out.println("All Employees Details :-");
		long countAll = employeeList.stream().count();
		System.out.println("Total Employees = " + countAll);
		//employeeList.stream().forEach(System.out :: println);
		employeeList.stream().forEach(s -> System.out.println(s));

		System.out.println();

		long countAgeGreaterThan30 = employeeList.stream().filter(i -> i.age > 30).count();
		System.out.println("CountAgeGreaterThan30 = " + countAgeGreaterThan30);
		List l02 = employeeList.stream().filter(i -> i.age > 30).collect(Collectors.toList());
		l02.stream().forEach(s -> System.out.println(s));

		System.out.println();

		System.out.println("Total Employees with Double Salary = " + countAll);
		List l03 = employeeList.stream().map((Employee e) -> {
			e.salary = e.salary * 2;
			return e;
		}).collect(Collectors.toList());
		l03.stream().forEach(s -> System.out.println(s));


		System.out.println();

		System.out.println("Find the number of male and female employees :-");
		Map<String, Long> CountMaleAndFemaleEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		for (Map.Entry<String, Long> entry : CountMaleAndFemaleEmployees.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}


		System.out.println();

		System.out.println("groupEmployeesByGender :");
		Map<String, List<Employee>> groupEmployeesByGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(groupEmployeesByGender);

		for (Map.Entry<String, List<Employee>> entry : groupEmployeesByGender.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println();

		System.out.println("Find the average salary of employees by department :-");
		Map<String, Double> CountAverageSalaryOfEmployeesByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		for (Map.Entry<String, Double> entry : CountAverageSalaryOfEmployeesByDepartment.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();

		System.out.println("Use of PartitioningBy :-");
		Map<Boolean, List<Employee>> partitioningBy = employeeList.stream().collect(Collectors.partitioningBy(i -> i.gender == "Male"));
		for (Map.Entry<Boolean, List<Employee>> entry : partitioningBy.entrySet()) {
			System.out.println(entry.getKey());
			for (Employee e : entry.getValue()) {
				System.out.println(e);
			}
			System.out.println();
		}
		System.out.println();

		employeeList.stream().filter(i -> i.yearOfJoining > 2015).map(i -> i.getName()).forEach(System.out::println);
		System.out.println("Find the average salary of employees by department :-");
		Map<String, Double> CountAverageSalaryOfEmployeesByDepartment2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(CountAverageSalaryOfEmployeesByDepartment2);
		for (Map.Entry<String, Double> entry : CountAverageSalaryOfEmployeesByDepartment2.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		Map<Object, Map<Object, Map<Object, Long>>> test = employeeList.stream().filter(i -> i.getAge() > 30).collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.groupingBy(e -> e.getGender(), Collectors.groupingBy(e -> e.getAge(), Collectors.counting()))));
		System.out.println(test);
		List<Employee> emp = employeeList.stream().sorted((e1, e2) -> {
			if (e1.id > e2.id) {
				return 1;
			}
			if (e1.id < e2.id) {
				return -1;
			}
			return 0;
		}).collect(Collectors.toList());
		for (Employee e : emp) {
			System.out.println(e);
		}
		double salary = employeeList.stream().filter(e -> e.age == 24).mapToDouble(Employee::getSalary).sum();
		System.out.println(salary);
		double salary1 = employeeList.stream().filter(e -> e.age == 24).collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println(salary1);
		Employee e = employeeList.get(0);
		System.out.println(e.id);
		System.out.println();

		String[] colours = {"red", "green", "blue", "grey", "grey", "green", "white", "black"};
		List<String> coloursList = Arrays.asList(colours);
		Map<String, Long> colorMap = coloursList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		for (Map.Entry<String, Long> x : colorMap.entrySet()) {
			if (x.getValue() == 1) {
				System.out.print(x.getKey() + ",");
			}
		}
		System.out.println();
	}

}
