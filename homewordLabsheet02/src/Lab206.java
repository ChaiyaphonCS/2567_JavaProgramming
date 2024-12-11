

import javax.swing.*;
public class Lab206 {

	public static void main(String[] args) {
		
		int vanilla = 10;
		int choccolate = 15;
		int topping = 5;
		int price;
		String Flavor;
		String FlavorInput = JOptionPane.showInputDialog(null, "[1] Vanilla Flavor 10 B." + 
		"\n[2] Chocolate Flavor 15 B." + "\nPress number to choose flavor:");
		int FlavorSelected = Integer.parseInt(FlavorInput);
		
		price = (FlavorSelected== 1) ? vanilla : (FlavorSelected == 2) ? choccolate : 0;
        Flavor = (FlavorSelected == 1) ? "Vanilla" : (FlavorSelected == 2) ? "Chocolate" : "Chocolate";
		
        while (FlavorSelected !=1 && FlavorSelected != 2) {
        	JOptionPane.showMessageDialog(null,"ERROR: Wrong choice!"
        			+"\nTry again...","ERROR", JOptionPane.ERROR_MESSAGE);
        	FlavorInput = JOptionPane.showInputDialog(null, "[1] Vanilla Flavor 10 B." + 
        			"\n[2] Chocolate Flavor 15 B." + "\nPress number to choose flavor:");
        			 FlavorSelected = Integer.parseInt(FlavorInput);
        			
        			price = (FlavorSelected== 1) ? vanilla : (FlavorSelected == 2) ? choccolate : 0;
        	        Flavor = (FlavorSelected == 1) ? "Vanilla" : (FlavorSelected == 2) ? "Chocolate" : "Chocolate";
		}
        int Topping  = JOptionPane.showConfirmDialog(null, "Do you want to add topping?","Topping",JOptionPane.YES_NO_OPTION);
        int toppingPrice = (Topping == JOptionPane.YES_OPTION) ? topping : 0;
        int totalPrice = price + toppingPrice;
        String addtopping = (toppingPrice > 0) ? "with topping" : "no topping";
        
        JOptionPane.showMessageDialog(null,
    	        "You choose " + Flavor +" Flavor"+
    	        "\nAnd " + addtopping
    	        + "\nTotal price = " + totalPrice + " baht.");

	}

}