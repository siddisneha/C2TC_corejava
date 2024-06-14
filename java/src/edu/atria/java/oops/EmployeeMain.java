package edu.atria.java.oops;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creation of scanner class
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee details");
		int id=sc.nextInt();
		String name=sc.next();
		double salary=sc.nextDouble();
		String designation=sc.next();*/
		
		
		//calling  of default constructor
		// className objName=new=className();
		/*Employee eOne=new Employee();
	
		System.out.println(eOne);*/
		//calling of parameterized constructor
		Employee eTwo=new Employee(96,"Robert",80000.00,"Developer");
		System.out.println(eTwo);
		/*eOne.setEmp_id(id);
		eOne.setEmp_name(name);
		eOne.setSalary(salary);
		eOne.setDesignation(designation);
		
		
		System.out.println("printing the employee id:"+eOne.getEmp_id());
		System.out.println("printing the employee name:"+eOne.getEmp_name());
		System.out.println("printing the employee salary:"+eOne.getSalary());
		System.out.println("printing the employee designation:"+eOne.getDesignation());*/
		
		
		
		
		
	}

}
