package edu.atria.java.statickeyword;

public class Employee {
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	private int empId;
	private String empName;

	// Static variable or class variable
	private static String company = "IBM";

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

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName +", company=" +company+"]";
		
	}

}
