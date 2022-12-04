package com.second.project;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
public class CityAndSalary extends EmployeeClass{
	public void cityCount() {
   	 empDetails();
		ArrayList<String> cities=new ArrayList<String>();
		Iterator<EmployeeClass> citIte=employees.iterator();
		while(citIte.hasNext()) {
			cities.add((String)citIte.next().getEmpCity());
		}
		Map<String,Long> citcount=cities.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		System.out.println("Count of employees from each city :");
		System.out.println(citcount);
	} 
	public void displaySalary() {
		try {
		TreeMap<Integer,Integer> salary=new TreeMap<Integer,Integer>();
		for(EmployeeClass sal:employees) {
			salary.put(sal.getEmpId(), sal.getEmpSalary());
		}
		System.out.println("Monthly Salary of employee along with their id is");
		System.out.println(salary);
	}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		CityAndSalary object3=new CityAndSalary();
		object3.cityCount();
		object3.displaySalary();
	}
}