package com.java.practice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{

    private String name;
    private int empId;
    private long salary;

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public long getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(String name, int empId, long salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }



	
	  //public int hashCode() { return 1; }

	

	@Override
	public int compareTo(Employee o) {
		
		if(empId > o.empId) {
			return 1;
		}else if(empId < o.empId) {
			return -1;
		}else {
			return 0;
		}
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee e = (Employee)obj;
		
		Integer id = e.empId;
		Integer id1= this.empId;
		
		return id.equals(id1);
	}
	 
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empId;
	}
	

}


public class HashmapAndTreeset {

	public static void main(String[] args) {
		
		Map<Employee,String> hMap = new HashMap<Employee,String>();
	      Employee e1 = new Employee ("abc", 15, 20000);
	      Employee e2 = new Employee ("abc", 15, 20000);
	      Employee e3 = new Employee ("xyz", 14, 40000);
	      hMap.put(e1,"ABC");
	      hMap.put(e2,"PQR");
	      hMap.put(e3,"XYZ");

	      System.out.println("Size : " + hMap.size());

	      System.out.println("== : " + (e1==e2));

	      System.out.println(".equals : " + e1.equals(e2));
		
	      Set<Employee> tSet = new TreeSet<Employee> ();
	      tSet.add(e1);
	      tSet.add(e2);
	      tSet.add(e3);
	      
	      System.out.println(tSet);
	      
	      Set<Employee> hSet = new HashSet<Employee> ();
	      hSet.add(e1);
	      hSet.add(e2);
	      hSet.add(e3);
	      
	      System.out.println(hSet);

	}

}
