package com.abdoulc.springboot.swaggerexample.resource;

import io.swagger.annotations.ApiModelProperty;

public class Product {
	@ApiModelProperty(notes = "name of product")
	private String productName;
	
	@ApiModelProperty(notes = "category of product")
	private String productCategory;
	
	@ApiModelProperty(notes = "price of product")
	private Long productPrice;
	
	public Product(String name, String category, Long price) {
		this.productName = name;
		this.productCategory = category;
		this.productPrice = price;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
