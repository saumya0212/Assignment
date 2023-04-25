package com.ECommerce.product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table (name="products")
public class Product {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
private long id;
public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

private String name;
private String description;
private double price;
private int quantity;

public Product() {
}

	public Product (String name, String description, double price, int quantity) {

super();
this.name =name;
this.description=description;
this.price=price;
this.quantity = quantity;
}
}
