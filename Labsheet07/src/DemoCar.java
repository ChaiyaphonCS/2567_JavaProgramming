
public class DemoCar {

	public static void main(String[] args) {
		Car car1 = new Car("Chevrolet","Cruze",2009,150000.0);
		System.out.println(car1);
		System.out.println("Mileage: "+car1.getMileage());
		Spacing();
		Car car2 = new Car();
		car2.setCompanyName("Toyota");
		car2.setModelName("Corolla");
		car2.setYear(2015);
		
		System.out.println("Update Car Details:");
		System.out.println(car2);
		car2.setYear(1800);
		car2.setCompanyName(null);
		
		

	}
	
	
	
	
	
	
	public static void Spacing() {
		System.out.println();
	}

}
