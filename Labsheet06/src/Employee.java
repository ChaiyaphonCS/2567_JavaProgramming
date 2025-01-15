
public class Employee {
	//private attribute
	private String name;
	private int hourWorked;
	private double hourlyRate;
	
	public void setEmployeeDetils(String empName,int hours,double rate) {
		name = empName;
		hourWorked = hours;
		hourlyRate = rate;
	}

	public double calculateSalary() {
		double salary = hourWorked * hourlyRate;
		if(hourWorked > 40) {
			double bonus = salary * 0.10;
			salary +=bonus;
		}
		return salary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("\nName: "+name);
		System.out.println("Hours Worked: "+hourWorked);
		System.out.println("Hourly Rate: "+hourlyRate);
		System.out.println("Total Salary: "+calculateSalary());
	}
}