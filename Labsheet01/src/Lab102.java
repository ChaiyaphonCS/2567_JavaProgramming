import java.util.*;
import java.text.*;
public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input product name   : ");
		int numOfMinutes = input.nextInt();
		
		int numOfHour = numOfMinutes /60;
		int numOfDay = numOfHour /24;
		int numOfDayy = numOfDay % 365;
		int numOfYear = numOfDay / 365;
		System.out.print(numOfMinutes + " minutes is approximately "+numOfYear+" years and "+numOfDayy+" days");

	}

}
