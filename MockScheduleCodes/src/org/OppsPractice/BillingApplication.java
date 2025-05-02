package org.OppsPractice;
import java.util.*;
class Customer {
	private int id;
	private String name;
	private String contact;

	public Customer() {

	}

	public Customer(int id, String name, String contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}

class Product {
	private int id;
	private String name;
	private int price;
	private int qty;
	private int rate;

	public Product() {

	}

	public Product(int id, String name, int price, int qty, int rate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}

class Bill {
	void calBill(Customer c , Product ...p) {
		System.out.println("====================================================");
		System.out.println("\t\tBilling System");
		System.out.println("====================================================");
		System.out.println("Customer ID: "+c.getId());
		System.out.println("Customer Name: "+c.getName());
		System.out.println("Customer Contact: "+c.getContact());
		System.out.println("----------------------------------------------------");
		
		System.out.printf("%-5s %-5s %-5s %-5s %-10s\n","ID","Product","Price","Qty","Rate","Total");
		System.out.println("----------------------------------------------------");
		
		double totalBill = 0;
		for(Product product : p) {
			double total = product.getPrice() * product.getRate();
			totalBill += total;
			System.out.printf("%-5s %-5s %-5s %-5s %-10s\n",product.getId() , product.getName(), product.getPrice(),product.getQty(),product.getRate(),total );
		}
		System.out.println("Total Amount: "+totalBill);
			
	}
}

public class BillingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter Total Customer: ");
		int size = sc.nextInt();
		
		Customer []customer = new Customer[size];
		for(int i = 0 ; i < size; i++) {
			System.out.println("Customer ID: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Customer Name: ");
			String name = sc.nextLine();
			
			System.out.println("Customer Contact: ");
			String contact = sc.nextLine();
			
			customer[i] = new Customer(id,name,contact);
		}
		
		System.out.println("Enter total Product: ");
		int size1 = sc.nextInt();
		sc.nextLine();
		Product [] product = new Product[size1];
		
		for(int i = 0;i < size; i++) {
			System.out.println("Product ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Product Name: ");
			String name = sc.nextLine();
			
			System.out.println("Product Price: ");
			int price = sc.nextInt();
			
			System.out.println("Product Quantity: ");
			int qty = sc.nextInt();
			
			System.out.println("Product Rate: ");
			int rate = sc.nextInt();
			sc.nextLine();
			product[i] = new Product(id, name, price,qty,rate);
		}
		Bill bill = new Bill();
		
		for(Customer c : customer) {
			bill.calBill(c, product);
		}
	
	}

}
