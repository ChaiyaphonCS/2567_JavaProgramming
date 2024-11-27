import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name   : ");
		String productName = input.nextLine();
		
		System.out.print("Input product unit   : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input Price per unit : ");
		float productPrice = input.nextFloat();
		System.out.println("------------------------------------");
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println("Total price is "+frm.format(totalPriceofProduct)+" baht.");
		System.out.println("------------------------------------");
		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		System.out.println("------------------------------------");
		float totalDiscount = totalPriceofProduct*discount/100;
		
		System.out.println("Discount from "+discount+"%   "+frm.format(totalDiscount)+" baht.");
		System.out.println("Amount to be paid   "+frm.format((totalPriceofProduct-totalDiscount))+" baht.");
		
		

	}

}
