package beans;

public interface EmployeeService {
	
	//public void payRaise(long sourceEmployeeID, double amount);
	public void payChange(long employeeID, double amount);
	public Employee getEmployee(long employeeID);

}
