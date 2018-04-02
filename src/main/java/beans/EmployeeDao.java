package beans;

import java.util.List;

public interface EmployeeDao {
	public void insert(Employee employee);
	public void update(Employee employee);
	public void update(List<Employee>employee);
	public void delete(long employeeID);
	public Employee find(long employeeID);
	public List<Employee> find(List<Long> employeeIDs);
	public List<Employee> find(String employeeName);
	
}
