import javax.swing.*;
import java.util.*;
public class Lab507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = new int[5];
		for (int i = 0; i < num.length;i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+":")); 
		}
		showEven(num);
		showOdd(num);

	}
	public static void showEven(int[] _nums) {
		String num ="";
		for (int evenNumber : _nums) {
			if (evenNumber % 2 ==0) {
				num += evenNumber+" "; 
			}
		}
		JOptionPane.showMessageDialog(null,"List of even number:\n"+num);
	}
	public static void showOdd(int[] _nums) {
		String num ="";
		for (int oddNumber : _nums) {
			if (oddNumber % 2 !=0) {
				num += oddNumber+" "; 
			}
		}
		JOptionPane.showMessageDialog(null,"List of Odd number:\n"+num);
	}

}
