package com.AlgoDomainSolutions.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AlgoDomainSolutions.model.Charges;
import com.AlgoDomainSolutions.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
