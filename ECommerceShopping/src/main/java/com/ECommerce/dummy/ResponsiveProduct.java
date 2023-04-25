package com.ECommerce.dummy;

public class ResponsiveProduct {
	
private long id;
private String name;
private String description;
private double price;
private int quantity;

public ResponsiveProduct () {
}
public ResponsiveProduct(String name, String description,double price,int quantity) {
	super();
	this.name=name;
	this.description=description;
	this.price=price;
	this.quantity=quantity;
}
public long getId() {
return id;
}

public void setId(long id) {
this.id = id;
}

public String getName() { 
return name;
}

public void setName (String name) { 
this.name = name;
}
public String getDescription() { 
return description;
}
public void setDescription (String description) { 
this.description=description;
}

public double getPrice() {
return price;
}
public void setPrice (double price) { 
this.price=price;
}
public int getQuantity() {
return quantity;
}
public void setQuantity (int quantity) {
this.quantity=quantity;
}
}
	
	
	

