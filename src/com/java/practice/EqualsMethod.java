package com.java.practice;

class EmployeeTest {
	int id;
	String name;
	
	EmployeeTest(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		EmployeeTest emp = (EmployeeTest)obj;
		boolean result = emp.id == this.id?true:false;
		
		return result;
	}
}

public class EqualsMethod {

	public static void main(String[] args) {
		EmployeeTest e01 = new EmployeeTest(01, "Abhinav");
		EmployeeTest e02 = new EmployeeTest(01, "Akhil");
		System.out.println(e01.equals(e02));
		
		Long l = new Long(23);
		String s = new String("23");
		System.out.println(s.equals(l));
	}

}
