import java.util.*;
public class Lab202 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input number : ");
		int preNumber = input.nextInt();
		while (true) {
			System.out.print("Input number : ");
			int number = input.nextInt();
			if (number < preNumber) {
				break;
			}
			preNumber = number;
		}
		System.out.print("\n\nBYE BYE");
		

		input.close();

	}

}
