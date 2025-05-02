/*Q6.  Sorting a List of Products by Price Using Comparator
Description: Create a list of Product objects with name and price fields. Sort the list of products by price in ascending
 order using a Comparator.
*/
package org.Date15_03_2025;

import java.util.*;

class Product {
	private String name;
	private int price;

	public Product() {

	}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
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
	public String toString() {
		return "Name: "+name +"\t"+"Price: "+price;
	}
}
class SortByPrice implements Comparator<Product>{
	
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getPrice() , o2.getPrice());
	}
	
}

public class SortbyComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter the Product name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter the Price: ");
			int price = sc.nextInt();
			sc.nextLine();
			list.add(new Product(name,price	));
		}
		Collections.sort(list, new SortByPrice());
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
