import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name : ");
		String strproductUnit = JOptionPane.showInputDialog("Input Product Unit : "); 
		int productUnit = Integer.parseInt(strproductUnit);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input price per Unit : "));
		

		double totalPriceofProduct = productUnit * productPrice;
		double totalwithVat = totalPriceofProduct + (totalPriceofProduct*7/100);
		String frmtotalPriceofProduct = String.format("%,.2f",totalPriceofProduct);
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		//สั่งแสดงผ่าน dialogbox
		
		JOptionPane.showMessageDialog(null, 
				"Total Price is "+frmtotalPriceofProduct+" baht."+
		        "\nAdd Vat 7% is "+frmtotalwithVat+" baht.");
		

		
		
	}

}
