import java.util.Scanner;

public class Lab204 {

	public static void main(String[] args) {
		
		int x, y, sum;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		x = scan.nextInt();
		
		System.out.print("Input value of Y : ");
		y = scan.nextInt();
		
		while(y <= x) {
			System.out.print("Input value of Y, again : ");
			y = scan.nextInt();
		}
		
		sum = x;
		
		while(x <= y) {
			System.out.println(sum + " + " + x + " = " + (sum + x));
			sum += x;
			x++;
		}
	}
}
