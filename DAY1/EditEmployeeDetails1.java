import java.util.List;
import java.util.Scanner;

public class EditEmployeeDetails1 {
	Scanner s=new Scanner(System.in);
	public void editEmpName(List<Employee> employeeList)
	{       
                System.out.println("PlEASE ENTER THE ID OF THE NAME YOU WNAT TO EDIT");
                int empId=s.nextInt();
                 s.nextLine();
                for(Employee employee:employeeList)
		{
                  if(employee.getEmpId()==empId)
                  {   
		System.out.println("PlEASE ENTER THE NEW NAME");
		String newName=s.nextLine();
		employee.setEmpName(newName);
                }
                }
	}
	public void maximumSalary(List<Employee> employeeList)
	{
		float maximumSal=0;
                int empId=0;
		for(Employee employee:employeeList)
		{
		if(employee.getSalary()>maximumSal)
		{
			maximumSal=employee.getSalary();
                        empId=employee.getEmpId();
		}
		}
		 System.out.println("Employee ID "+ empId+" has Maximum Salary Amount among all Employees :   "+  maximumSal);
	}
	public float salaryDifference(List<Employee> employeeList)
	{
                System.out.println("SALARY DIFFERENCE");
                System.out.println("PlEASE ENTER THE ID OF THE TWO EMPLOYEES");
                int empId1=s.nextInt();
                int empId2=s.nextInt();
                float empSalary1=0.0f;
                float empSalary2=0.0f;
                 for(Employee employee:employeeList)
		{
		if(employee.getEmpId()==empId1)
                  {
                  empSalary1=employee.getSalary();
		}
                  if(employee.getEmpId()==empId2)
                  {
                  empSalary2=employee.getSalary();
		}
		}

		float salaryDiff=Math.abs(empSalary1-empSalary2);
		return salaryDiff;
	}
}
