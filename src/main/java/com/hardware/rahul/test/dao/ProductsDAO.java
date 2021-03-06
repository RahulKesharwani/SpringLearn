package com.hardware.rahul.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hardware.rahul.test.model.ProductType;
import com.hardware.rahul.test.model.Products;

/**
 * To fetch all the values from product table.
 * @author Rahul
 *
 */
public interface ProductsDAO extends JpaRepository<Products, Integer>{
	
	Integer countProductsByName(String Name);
	
	Products findProductByProductId(Integer productId);
	
	//@Query("SELECT S FROM products S WHERE s.product_type_id = :productType")
	List<Products> findProductsByProductType(ProductType productType);
}