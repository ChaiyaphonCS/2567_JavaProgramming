import javax.swing.JOptionPane;

public class Lab203 {
	
	public static void main(String[] args) {

		String weightInput = JOptionPane.showInputDialog(null, "Input Weight:", "Input", JOptionPane.QUESTION_MESSAGE);
		double weight = Double.parseDouble(weightInput);

		String heightInput = JOptionPane.showInputDialog(null, "Input Height:", "Input", JOptionPane.QUESTION_MESSAGE);
		double height = Double.parseDouble(heightInput) / 100;

		double bmi = weight / (height * height);

		String bmiCategory;

		if (bmi < 18.5) {
			bmiCategory = "Underweight";
		} else if (bmi < 25) {
			bmiCategory = "Normal-weight";
		} else if (bmi < 30) {
			bmiCategory = "Overweight";
		} else {
			bmiCategory = "Obesity";
		}

		JOptionPane.showMessageDialog(null, "BMI = " + String.format("%.1f", bmi) + "\nYou're " + bmiCategory, "BMI",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
