
public class Product {
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String productName, double productPrice, double productVatRate) {
		name = productName;
		price = productPrice;
		vatRate = productVatRate;
		
	}
	public double calculateTotalPrice() {
		double totalPrice = price + (price * vatRate/100)  ;
		return totalPrice;
		
	}
	public void displayProductDetails() {
		System.out.print("Product Details: ");
		System.out.println("\nProduct Name: "+name);
		System.out.println("Price (Before VAT): "+price);
		System.out.println("Price (After VAT): "+calculateTotalPrice());
	}

}
