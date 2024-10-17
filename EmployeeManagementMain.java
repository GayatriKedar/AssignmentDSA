package AssignmentDSA;

import java.util.Scanner;

public class EmployeeManagementMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		LinkedList_Employee employeeList = new LinkedList_Employee();

		int choice;
		do {
			System.out.println("1. Add Employee");
			System.out.println("2. Find Employee by ID");
			System.out.println("3. Display All Employees");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter ID: ");
				int id = scanner.nextInt();
				scanner.nextLine(); 
				System.out.print("Enter Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Salary: ");
				double salary = scanner.nextDouble();
				scanner.nextLine(); 
				System.out.print("Enter Email: ");
				String email = scanner.nextLine();
				String message = employeeList.addEmployee(id, name, salary, email);
				System.out.println(message);
				break;
			case 2:
				System.out.print("Enter Employee ID to search: ");
				int searchId = scanner.nextInt();
				Employee employee = employeeList.findEmployee(searchId);
				if (employee != null) {
					System.out.println("ID: " + employee.id + ", Name: " + employee.name + ", Salary: "+ employee.salary + ", Email: " + employee.email);
				} else {
					System.out.println("Employee not found.");
				}
				break;
			case 3:
				System.out.println("List of Employees:");
				System.out.println(employeeList.displayEmployees());
				break;
			case 4:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 4);
	}

}
