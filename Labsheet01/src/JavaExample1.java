import java.util.*;
import java.text.*;
public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//กำหนด Object ในการรับข้อมูลทาง keyboard
		Scanner input = new Scanner(System.in);
		//กำหนด Object ในการจัดรูปแบบ
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//แสดงผลและรับข้อมูลชื่อสินค้า
		System.out.print("input product name  : ");
		String productName = input.nextLine();
		//แสดงและรับข้อมูลจำนวนสินค้า
		System.out.print("input product unit  : ");
		int productUnit = input.nextInt();
		//แสดงและรับข้อมูลราคาสินค้า
		System.out.print("input price per unit: ");
		float productPrice = input.nextFloat();
		System.out.println();
		//คำนวณหาผลรวมของสินค้า
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println("Total price is "+frm.format(totalPriceofProduct)+" baht.");
		//คำนวณภาษีเพื่ม 7 เปอร์เซ็น
		float totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		System.out.println("Add VAT 7%  is "+frm.format(totalwithVat)+" baht.");
		System.out.println();
		//Output using String.format and printf
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		System.out.println("Output using String.format");
		System.out.println("Add VAT 7%% is "+frmtotalwithVat+" baht.");
		System.out.println("Output using printf");
		System.out.printf("Add VAT 7%% is is %,.2f ", totalwithVat);
		input.close();

	}

}
