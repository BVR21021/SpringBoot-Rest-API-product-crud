package com.AlgoDomainSolutions.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private Integer productid;
	private String productName;
	private String productType;
	private String productCategory;
	private double productPrice;
	
	private Charges charges;

	public Product() {
		super();
	}

	public Product(Integer productid, String productName, String productType, String productCategory,
			double productPrice, Charges charges) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.productType = productType;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.charges = charges;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Charges getCharges() {
		return charges;
	}

	public void setCharges(Charges charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "Product [getProductid()=" + getProductid() + ", getProductName()=" + getProductName()
				+ ", getProductType()=" + getProductType() + ", getProductCategory()=" + getProductCategory()
				+ ", getProductPrice()=" + getProductPrice() + ", getCharges()=" + getCharges() + "]";
	}

	

}
