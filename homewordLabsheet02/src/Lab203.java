

import java.text.DecimalFormat;

import javax.swing.*;
public class Lab203 {
	public static void main(String[] args) {
		
		double inputWeight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		
		double inputHeight = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		
		double height = inputHeight /100;
		double bmi = inputWeight /(height * height);
		DecimalFormat frm = new DecimalFormat("#,###.0");
		String information;
		
		if (bmi < 18.5) {
			information = "Underweight";
		}
		else if (bmi >= 18.5 || bmi <= 24.9) {
			information = "Normal-weight";
		}
		else if (bmi >= 25.0 || bmi <= 29.9) {
			information = "Overweight";
		}
		else {
			information ="obesity";
		}
		
		JOptionPane.showMessageDialog(null,"BMI = "+frm.format(bmi)+"\nYour're "+information,"BMI",JOptionPane.WARNING_MESSAGE);
		
	}
}
