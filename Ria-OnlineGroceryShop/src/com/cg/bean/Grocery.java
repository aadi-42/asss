package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "grocery_hib")
public class Grocery {

	@Id
	@SequenceGenerator(name = "g_seq", sequenceName = "grocery_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "g_seq")
	private int id;
	private String name;
	private float price;
	private String category;
	private int quantity;
	private String unit;
	private String description;
	
	public Grocery() {
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Grocery(int id, String name, float price, String category,
			int quantity, String unit, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.unit = unit;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Grocery [id=" + id + ", name=" + name + ", price=" + price
				+ ", category=" + category + ", quantity=" + quantity
				+ ", unit=" + unit + ", description=" + description + "]";
	}
	
	
}
