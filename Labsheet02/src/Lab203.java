import javax.swing.*;
public class Lab203 {

	public static void main(String[] args) {
		
		double inputWeight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		
		double inputHeight = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		
		double bmi = inputWeight /(inputHeight * inputHeight);
		
		String information;
		
		if (bmi < 18.5) {
			information = "Underweight";
		}
		else if (bmi => 18.5 || bmi <= 24.9) {
			information = "Normal=weight";
		}
		
		JOptionPane.showConfirmDialog(null,"BMI = "+bmi);
		

	}

}
