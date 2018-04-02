package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDaoInMemoryImpl implements EmployeeDao {
	public Map<Long, Employee> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<Long, Employee> employeeMap) {
		this.employeeMap = employeeMap;
	}


	private Map<Long, Employee> employeeMap = new HashMap<Long, Employee>();
	{
		Employee employee1 = new Employee(1L, "Dylan", "Wells Fargo", 40000);
		Employee employee2 = new Employee(2L, "Sierra", "Principal", 75000);

		employeeMap.put(employee1.getEmployeeID(), employee1);
		employeeMap.put(employee2.getEmployeeID(), employee2);

	}

	public void insert(Employee employee) {
		employeeMap.put(employee.getEmployeeID(), employee);
	}

	public void update(Employee employee) {
		employeeMap.put(employee.getEmployeeID(), employee);
	}

	public void update(List<Employee> employees) {
		for (Employee employee : employees) {
			update(employee);
		}
	}

	public void delete(long employeeID) {
		employeeMap.remove(employeeID);
	}

	public Employee find(long employeeID) {
		return employeeMap.get(employeeID);
	}

	public List<Employee> find(List<Long> employeeIDs) {
		List<Employee> employees = new ArrayList<Employee>();
		for (Long id : employeeIDs) {
			employees.add(employeeMap.get(id));
		}

		return employees;
	}

	public List<Employee> find(String employeeName) {
		List<Employee> employees = new ArrayList<Employee>();
		for (Employee employee : employeeMap.values()) {
			if (employeeName.equals(employee.getEmployeeName())) {
				employees.add(employee);
			}
		}
		return employees;
	}
	
	

	
}
