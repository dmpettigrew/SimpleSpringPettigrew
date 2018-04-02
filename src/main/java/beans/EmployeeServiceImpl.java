package beans;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	
	
	public EmployeeServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void payChange(long employeeID, double amount) {
		// TODO Auto-generated method stub
		Employee employee = employeeDao.find(employeeID);
		employee.setSalary(employee.getSalary() + amount);
		employeeDao.update(employee);
	}

	public Employee getEmployee(long employeeID) {
		// TODO Auto-generated method stub
		return employeeDao.find(employeeID);
	}
	
}
	
