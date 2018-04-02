//Melissa Pettigrew
package beans;


public class Employee {
	private long employeeID;
	private String employeeName;
	private String employeeEmployer;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long employeeID, String employeeName, String employeeEmployer, double salary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeEmployer = employeeEmployer;
		this.salary = salary;
	}

	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmployeeEmployer() {
		return employeeEmployer;
	}

	public void setEmployeeEmployer(String employeeEmployer) {
		this.employeeEmployer = employeeEmployer;
	}



}