import javax.swing.*;
public class Lab105 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String cdId = JOptionPane.showInputDialog("This program calculates the total cost of a Cd order"
                + "\nPlease enter the ID of the CD");
        String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
        String inputCdPrice = JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars");
        double cdPrice = Double.parseDouble(inputCdPrice);
        String inputCdQuantity = JOptionPane.showInputDialog("Please enter the quantity to be purchased");
        int cdQuantity = Integer.parseInt(inputCdQuantity);

        final double TAX_RATE = 6.25;
        double cdSubtotal = cdPrice*cdQuantity;
        double cdTotal = (cdSubtotal * TAX_RATE /100)+cdSubtotal ;

        JOptionPane.showMessageDialog(null, "Summary of the transaction:"+"\n\nCD ID: "+cdId+"\nCD Title: "+cdTitle+"\nCD Unit Price: $"+cdPrice+
                "\nCD Quantity: "+cdQuantity+"\n\nSubtotal: $"+cdSubtotal+"\nTax rate: "+TAX_RATE+"%"+"\nTotal: $"+cdTotal+"\n\nEnd of Program");








    }

}