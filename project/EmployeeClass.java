package com.second.project;
import java.util.ArrayList;
public class EmployeeClass {        
	int empId;
	String empName;
	int empAge;
	int empSalary;
	String empDepartment;
	String empCity;
	public EmployeeClass(int id, String name, int age, int salary, String department, String city) {
		empId = id;
		empName = name;
		empAge = age;
		empSalary = salary;
		empDepartment = department;
		empCity = city;
	}
	public EmployeeClass() {
		super();
	}
	ArrayList<EmployeeClass> employees =new ArrayList<EmployeeClass>();
	public void empDetails() {
	EmployeeClass e1=new EmployeeClass(1,"Suraj",25,25000,"Civil","Pune");
	EmployeeClass e2=new EmployeeClass(2,"Hemanth",29,15000,"Electrical","Mumbai");
	EmployeeClass e3=new EmployeeClass(3,"Gnani",28,18000,"Developer","Pune");
	EmployeeClass e4=new EmployeeClass(4,"Charan",27,48000,"Finance","Delhi");
	EmployeeClass e5=new EmployeeClass(5,"Kishore",23,79000,"Software","Chennai");
	EmployeeClass e6=new EmployeeClass(6,"Harish",26,39000,"Mechanial","Hydearabad");
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	employees.add(e4);
	employees.add(e5);
	employees.add(e6);
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public static void main(String[] args) {
		EmployeeClass object1=new EmployeeClass();
        object1.empDetails();
	}
}
