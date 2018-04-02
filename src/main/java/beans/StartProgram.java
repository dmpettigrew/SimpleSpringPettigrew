package beans;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// AnnotationConfigApplicationContext applicationContext = new
		// AnnotationConfigApplicationContext(BeanConfiguration.class)
		//;
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");

		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);

		System.out.println("The person below is employed by: "+employeeService.getEmployee(1).getEmployeeEmployer());
		System.out.println(employeeService.getEmployee(1).getEmployeeName()+"'s Salary before pay raise: " + "$"+employeeService.getEmployee(1).getSalary());
		employeeService.payChange(1,5000);
		System.out.println(employeeService.getEmployee(1).getEmployeeName()+"'s Salary after pay raise: " + "$"+employeeService.getEmployee(1).getSalary());
		System.out.println();
		
		System.out.println("The person below is employed by: "+employeeService.getEmployee(2).getEmployeeEmployer());
		System.out.println(employeeService.getEmployee(2).getEmployeeName()+"'s Salary before pay raise: " + "$"+employeeService.getEmployee(2).getSalary());
		employeeService.payChange(2,5500);
		System.out.println(employeeService.getEmployee(2).getEmployeeName()+"'s Salary before pay raise: " + "$"+employeeService.getEmployee(2).getSalary());
		
		applicationContext.close();
	}


}
