import javax.swing.*;
public class Lab104 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(null, "Welcome to the payroll application");
        String inputName = JOptionPane.showInputDialog("Enter employee name");
        String inputTotleHour = JOptionPane.showInputDialog("Enter total hour for this employee.");
        double totalHour = Double.parseDouble(inputTotleHour);

        double hourlyWage = 7.5;
        double grossEarnings = totalHour*hourlyWage;
        double taxRate = 0.15;
        double totalTax = grossEarnings * taxRate;
        double totalEarnings = grossEarnings - totalTax;

        JOptionPane.showMessageDialog(null, "Employee name: "+inputName+"\nHours worked: "+inputTotleHour+
                "\nHourly wage: $ "+hourlyWage+"\nGross earnings: $ "+grossEarnings+"\nTax rate: "+taxRate+
                "\nTax: $ "+totalTax+"\nNet earnings: $ "+totalEarnings);



    }

}