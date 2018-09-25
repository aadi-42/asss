package com.cg.learning.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.learning.beans.Product;

public class ProductDB {
	
	static List<Product> productList = loadList();
	
	public static List<Product> loadList() {
		return productList;
	}
	
	static {
		if(productList==null) {
			productList = new ArrayList<Product>();
			productList.add(new Product(101,"Laptop",45678,"ETRX"));
			productList.add(new Product(102,"IPad",65678,"IT"));
		}
	}
}
