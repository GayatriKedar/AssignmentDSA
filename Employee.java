package AssignmentDSA;

public class Employee {

		int id;
		String name;
		double salary;
		String email;
		Employee next;

		public Employee(int id, String name, double salary, String email) {
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.email = email;
			this.next = null;			
		}
}
