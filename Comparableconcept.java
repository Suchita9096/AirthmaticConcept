package com.csi.comparablemethod;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Employee implements Comparable<Employee> {

	private int empAge;

	private String empName;

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empAge=" + empAge + ", empName=" + empName + "]";
	}

	public Employee(int empAge, String empName) {
		super();
		this.empAge = empAge;
		this.empName = empName;
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if (empAge == e.getEmpAge()) {
			return 0;
		} else if (empAge<e.getEmpAge()) {
			return 1;
		} else {
			return -1;
		}

	}
}

public class Comparableconcept {
	public static void main(String[] args) {

		List<Employee> emp = new LinkedList<Employee>();
         
		emp.add(new Employee(25, "PRATAP"));
		emp.add(new Employee(20, "SUCHITA"));
		emp.add(new Employee(28, "RANGNATH"));
		
		Collections.sort(emp);
		emp.forEach(System.out::println);
		
	}
}
