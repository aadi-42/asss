package com.cg.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cg.bean.Employee;
import com.cg.exception.EmpException;
import com.cg.service.EmployeeService;

public class JdbcClient {

	DriverManagerDataSource driverManagerDataSource;

	public static void main(String[] args) throws EmpException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		EmployeeService eService = (EmployeeService) ctx.getBean("eService");
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			choice = getChoice(scan);
			switch (choice) {
			case 1:

				System.out.println("Insert a Record");
				System.out.println("Enter <Name> <Mobile> <Salary>");
				Employee emp = new Employee(0, scan.next(), scan.nextLong(),
						scan.nextDouble());

				boolean success = eService.insert(emp);

				if (success) {
					System.out.println("Employee Inserted");
				} else {
					System.out.println("Failed to Insert");
				}

				break;

			case 2:
				System.out.println("Find an Employee");
				System.out.println("Enter ID of Employee");
				Employee emp1 = null;
				int id = scan.nextInt();
				
				try {
					emp1 = eService.getEmployee(id);
				
				} catch (EmpException e) {
					System.out.println(e.getMessage() + " : " + id);
				}
				System.out.println("Record: " + emp1);
				break;

			case 3:
				System.out.println("Update Employee");
				System.out.println("Enter <id> <name><mobile><salary> of Employee");
				

				Employee emp3 = new Employee(scan.nextInt(), scan.next(), scan.nextLong(),
						scan.nextDouble());
				boolean succes = eService.updateEmployee(emp3);

				if (succes) {
					System.out.println("Employee Inserted");
				} else {
					System.out.println("Failed to Insert");
				}

				break;

			case 4:
				System.out.println("Display All Employees");
				List<Employee> emp2 = eService.getEmpList();
				System.out.println(emp2);
				break;

			case 5:
				System.out.println("Delete Employee");
				System.out.println("Enter the ID to be Deleted");
				int result = scan.nextInt();

				if (result == 1)
					System.out.println("DELETED");
				else
					System.out.println("NOT DELETED");
				break;

			case 6:
				System.out.println("Exit Application ");
				System.exit(0);
				break;
			}

		}

	}

	private static int getChoice(Scanner scan) {
		// TODO Auto-generated method stub
		int choice = 0;
		System.out.println("1. Insert Record");
		System.out.println("2. Find Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Display Records");
		System.out.println("5. Delete Records");
		System.out.println("6. Exit Application");
		System.out.println("Choose option from the above (1 to 6): ");
		choice = scan.nextInt(); // try catch for wrong entry
		return choice;
	}

}
