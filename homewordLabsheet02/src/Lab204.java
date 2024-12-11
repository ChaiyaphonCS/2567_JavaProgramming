

import java.util.*;
public class Lab204 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input value of X : ");
		int inputX = input.nextInt();
		System.out.print("Input value of Y : ");
		int inputY = input.nextInt();
		while (inputY <= inputX) {
			System.out.print("Input vaue of Y, again : ");
			inputY = input.nextInt();
			
		}
		System.out.println("");
		int sum = inputX;
		
		for (int i = inputX + 1; i <= inputY; i++) {
            int last = sum;
            sum += i;
            System.out.println(last + " + " + i + " = " + sum);
        }
        
	}

}