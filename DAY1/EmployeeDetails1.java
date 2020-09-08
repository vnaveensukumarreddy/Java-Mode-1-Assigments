import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails1 {

	public static void main(String[] args) {
		Employee employee1=new Employee(1,"Naveen",10.0f);
		Employee employee2=new Employee(2,"Surya",20.0f);
		Employee employee3=new Employee(3,"varun",30.0f);
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
        System.out.println(employeeList);
        EditEmployeeDetails1 editEmployeeDetails1=new EditEmployeeDetails1();
        editEmployeeDetails1.editEmpName(employeeList);
        System.out.println(employeeList);
       editEmployeeDetails1.maximumSalary(employeeList);
        System.out.println("Salary Difference:   "+ editEmployeeDetails1.salaryDifference(employeeList));
	}

}
