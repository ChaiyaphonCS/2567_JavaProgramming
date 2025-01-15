
public class TestEmployees {
	public static void main(String[] args) {
		// create two Employee objects
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//set employee details
		emp1.setEmployeeDetils("Natcha", 45, 20.0);
		emp2.setEmployeeDetils("Attakorn", 38, 25.0);
		
		//Display employee details
		System.out.println("Employee 1 Details");
		emp1.displayEmployeeDetails();
		
		System.out.println("\nEmployee 2 Details");
		emp2.displayEmployeeDetails();

	}

}
