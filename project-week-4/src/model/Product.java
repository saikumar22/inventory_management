package model;

public class Product {
	 private String Id;
	 private String name;
	 private String brand;
	 private String price;
	 
	public Product(String Id, String name, String brand, String price) {
		// TODO Auto-generated constructor stub
		this.Id=Id;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}

	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getbrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getprice() {
		return price;
	}
	public void setPrice(String price) {
		this.price=price;
	}

}
