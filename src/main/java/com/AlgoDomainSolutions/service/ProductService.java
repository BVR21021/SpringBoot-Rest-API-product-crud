package com.AlgoDomainSolutions.service;

import java.util.List;

import com.AlgoDomainSolutions.model.Charges;
import com.AlgoDomainSolutions.model.Product;

public interface ProductService {
	public Product saveProduct(Product pro,Charges c);

	public Product updateProduct(Product pro, Integer productid);

	public void deleteProduct(Integer productid);

	public Product getProduct(Integer productid);

	public List<Product> getAllProduct();
}
