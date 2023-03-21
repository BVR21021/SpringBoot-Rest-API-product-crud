package com.AlgoDomainSolutions.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AlgoDomainSolutions.model.Charges;
import com.AlgoDomainSolutions.model.Product;
import com.AlgoDomainSolutions.repo.ProductRepo;

@Service
public class ProductServiceimp implements ProductService {
	
	@Autowired
	private ProductRepo repo;

	@Override
	public Product saveProduct(Product pro,Charges c) {

		double gst=0,delivery=0,finalPrice=0,discount=0;
		if(pro.getProductCategory().equalsIgnoreCase("Electronics")){
			discount=0.15*pro.getProductPrice();
			gst=0.18*pro.getProductPrice();
			delivery=350;
		}
		else if(pro.getProductCategory().equalsIgnoreCase("Home Application")) {
			discount=0.22*pro.getProductPrice();
			gst=0.24*pro.getProductPrice();
			delivery=800;
		}
		else if(pro.getProductCategory().equalsIgnoreCase("clothing")) {
			discount=0.4*pro.getProductPrice();
			gst=0.12*pro.getProductPrice();
			delivery=0;
		}
		else if(pro.getProductCategory().equalsIgnoreCase("furniture")) {
			discount=0.10*pro.getProductPrice();
			gst=0.18*pro.getProductPrice();
			delivery=300;
		}
		finalPrice=pro.getProductPrice()+gst+delivery;
		c.setDelivery(delivery);
		c.setGst(gst);
		c.setFinalPrice(finalPrice);
		pro.setCharges(c);
		return repo.save(pro);
		
	}

	@Override
	public Product updateProduct(Product pro, Integer productid) {
		Optional<Product> optional=repo.findById(productid);
		Product prod=optional.get();
		prod.setProductid(productid);;
		prod.setProductName(pro.getProductName());
		prod.setProductType(pro.getProductType());
		prod.setProductCategory(pro.getProductCategory());
		prod.setProductPrice(pro.getProductPrice());
		return repo.save(prod); 
	}

	@Override
	public void deleteProduct(Integer productid) {

		repo.deleteById(productid);
		}

	
	@Override
	public Product getProduct(Integer productid) {

	Product p=repo.findById(productid).get();
	
		return p;
		
	}

	@Override
	public List<Product> getAllProduct() {

		List<Product> emps=repo.findAll();
		return emps;
	}

}
