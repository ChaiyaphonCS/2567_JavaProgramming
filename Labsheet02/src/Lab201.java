import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int BUFFET = 299;
		int isMember;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double totalPrice = BUFFET*numberofCustomer;
		//System.out.printf("Total Price is %,.2f baht.",totalPrice);
		do {
			isMember = JOptionPane.showConfirmDialog(null, "Total Price is "+frm.format(totalPrice)+" baht."
					+"\nDo you have a member card?");
		}while(isMember == JOptionPane.CANCEL_OPTION); 

		if(isMember == JOptionPane.YES_NO_OPTION) { //if(isMember == 0)
			double priceAfterDiscount = totalPrice*0.90; //discount = totalPrice -(totalPrice*10/100)
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(priceAfterDiscount)+" baht.");
		}else if (isMember == JOptionPane.NO_OPTION) { //if(isMember == 1)
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+totalPrice+" baht.");
		}
		

	}

}
