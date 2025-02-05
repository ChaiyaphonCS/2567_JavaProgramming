
public class Invoice {
private int invId;
private Customer customer;
private double amount;



Invoice(int id,Customer customer,double amount){
	this.invId = id;
	this.customer = customer;
	this.amount = amount;
}

public int getInvoiceID() {
	return this.invId;
}
public double getAmount() {
	return this.amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public Customer getCustomer() {
	return this.customer; //customer.ToString;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public int getCustomerID() {
	return this.getCustomer().getID();
}
public String getCustomerName() {
	return this.getCustomer().getName();
}
public int getCustomerDiscount() {
	return this.getCustomer().getDiscount();
}
public double getAmountAfterDiscount() {
	return this.getAmount()-(this.getAmount() *this.getCustomerDiscount()/100);
}
public String toString() {
	return "Invoice[id="+this.getInvoiceID()+",customer="+customer.toString()+",amount="+this.getAmountAfterDiscount()+"]";
}

}
