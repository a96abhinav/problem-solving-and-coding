package com.java.practice;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EmployeeModel {

	private int EmpId;

	private String EmpName;

	private int EmpAge;

	private String EmpGender;

	private String EmpDepartment;

	private int EmpYearOfJoining;

	private int EmpAverageSalary;

	public EmployeeModel() {
	}

	public EmployeeModel(int empId, String empName, int empAge, String empGender, String empDepartment,
			int empYearOfJoining, int empAverageSalary) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpAge = empAge;
		EmpGender = empGender;
		EmpDepartment = empDepartment;
		EmpYearOfJoining = empYearOfJoining;
		EmpAverageSalary = empAverageSalary;
	}

	public int getEmpId() {
		return EmpId;
	}

	@JsonSetter("emp_id")
	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	@JsonSetter("emp_name")
	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public int getEmpAge() {
		return EmpAge;
	}

	@JsonSetter("emp_age")
	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}

	public String getEmpGender() {
		return EmpGender;
	}

	@JsonSetter("emp_gender")
	public void setEmpGender(String empGender) {
		EmpGender = empGender;
	}

	public String getEmpDepartment() {
		return EmpDepartment;
	}

	@JsonSetter("emp_department")
	public void setEmpDepartment(String empDepartment) {
		EmpDepartment = empDepartment;
	}

	public int getEmpYearOfJoining() {
		return EmpYearOfJoining;
	}

	@JsonSetter("emp_year_of_joining")
	public void setEmpYearOfJoining(int empYearOfJoining) {
		EmpYearOfJoining = empYearOfJoining;
	}

	public int getEmpAverageSalary() {
		return EmpAverageSalary;
	}

	@JsonSetter("emp_average_salary")
	public void setEmpAverageSalary(int empAverageSalary) {
		EmpAverageSalary = empAverageSalary;
	}

	@Override
	public String toString() {
		return "EmployeeModel [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpAge=" + EmpAge + ", EmpGender="
				+ EmpGender + ", EmpDepartment=" + EmpDepartment + ", EmpYearOfJoining=" + EmpYearOfJoining
				+ ", EmpAverageSalary=" + EmpAverageSalary + "]";
	}

}