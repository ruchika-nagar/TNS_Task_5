import java.util.*;
public class T_6_EmployeeDemo {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        T_6_Employee employee = new T_6_Employee();

		        System.out.print("Enter Employee Salary: $");
		        int salary = sc.nextInt();
		        employee.setSalary(salary);

		        System.out.print("Enter Hours of Work per Day: ");
		        int hoursOfWorkPerDay = sc.nextInt();
		        employee.setHourperday(hoursOfWorkPerDay);

		        int finalSalary = employee.finalSalary();

		        System.out.println("Final Salary: $" + finalSalary);

		        sc.close();

			}
			}


