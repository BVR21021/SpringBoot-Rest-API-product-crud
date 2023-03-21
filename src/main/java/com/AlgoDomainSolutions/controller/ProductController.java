package com.AlgoDomainSolutions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AlgoDomainSolutions.model.Charges;
import com.AlgoDomainSolutions.model.Product;
import com.AlgoDomainSolutions.service.ProductService;


@RestController
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/save")
	public String save(@RequestBody Product pro,Charges c, Model m) {
		Product p = service.saveProduct(pro, c);
		String message = null;
		if (p != null) {
			message = "Product Data saved successfully in DataBase";
		} else {
			message = "Product not save in Database";
		}
		return message;
	}

	@DeleteMapping("/delete/{productid}")
	public void delete(@PathVariable Integer productid) {
		service.deleteProduct(productid);
	}

	@GetMapping("/get/{productid}")
	public Product getOne(@PathVariable Integer productid) {
		Product prod = service.getProduct(productid);
		return prod;
	}

	@GetMapping("/getAll")
	public List<Product> getAll() {
		List<Product> prods = service.getAllProduct();
		return prods;
	}

	@PutMapping("/update/{productid}")
	public Product update(@RequestBody Product pro, @PathVariable Integer productid) {
		Product p = service.updateProduct(pro, productid);
		return p;
	}
}
