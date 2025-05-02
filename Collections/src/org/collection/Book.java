package org.collection;

public class Book {
	private int id ;
	private String name ;
	private String pub;
	private int price;
	
	public Book(){
		
	}
	public Book(int id ,String name,String pub, int price) {
		this.id =  id;
		this.name = name;
		this.pub = pub;
		this.price = price;
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
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "\nId : " +id + "\t" +"Name: "+name +"\t" +"Publisher: "+pub +"\t"+"Price: "+ price;
		
				
	}
}
