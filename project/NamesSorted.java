package com.second.project;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class NamesSorted extends EmployeeClass {
     public void sortNames() {
    	 ArrayList<String> employ=new ArrayList<String>();
    	 empDetails();
    	 for(EmployeeClass emp:employees) {
    			System.out.println(emp.empId+" "+emp.empName+" "+emp.empAge+" "+emp.empSalary+" "+emp.empDepartment+" "+emp.empCity);
    		}
    		Iterator<EmployeeClass> sortIte=employees.iterator();
    		while(sortIte.hasNext()) {
    			employ.add(sortIte.next().getEmpName());		
    		}
    		Collections.sort(employ);
    		System.out.println();
    		System.out.println("Names of all employees in the sorted order are :");
    		System.out.println(employ);
     }
	public static void main(String[] args) {
		NamesSorted object2=new NamesSorted();
		System.out.println("List of the Employees :");
		object2.sortNames();
	}
}
