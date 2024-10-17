package AssignmentDSA;

public class LinkedList_Employee {

	private Employee head;
	public  LinkedList_Employee() {
		head = null;
	}
	public String addEmployee(int id, String name, double salary, String email) {
		if (findEmployee(id) != null) {
			return "Error: Employee ID already exists.";
		}
		Employee newEmployee = new Employee(id, name, salary, email);
		if (head == null) {
			head = newEmployee;
		} else {
			Employee current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newEmployee;
		}
		return "Employee registered successfully!";
	}
	public Employee findEmployee(int id) {
		Employee current = head;
		while (current != null) {
			if (current.id == id) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
	public String displayEmployees() {
		if (head == null) {
			return "No employees found.";
		}
		StringBuilder sb = new StringBuilder();
		Employee current = head;
		while (current != null) {
			sb.append("ID: ").append(current.id).append(", Name: ").append(current.name).append(", Salary: ")
					.append(current.salary).append(", Email: ").append(current.email).append("\n");
			current = current.next;
		}
		return sb.toString();
	}

}
