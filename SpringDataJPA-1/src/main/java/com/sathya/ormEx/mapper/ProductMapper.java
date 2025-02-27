package com.sathya.ormEx.mapper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sathya.ormEx.entity.Product;
import com.sathya.ormEx.model.ProductDetails;

@Component
public class ProductMapper {
public Product modelToEntityConversion(ProductDetails productDetails)
{
	Product product = new Product();
	product.setProId(productDetails.getProId());
	product.setProName(productDetails.getProName());
	product.setProPrice(productDetails.getProPrice());
	product.setCreateAt(LocalDateTime.now());
	product.setCreateBy(System.getProperty("user.name"));
	return product;
	
}
public List<Product> modelToEntityConversion(List<ProductDetails> productDetails)
{
	List<Product> products = new ArrayList<Product>();
	for(ProductDetails details:productDetails)
	{
	Product product = new Product();
	product.setProId(details.getProId());
	product.setProName(details.getProName());
	product.setProPrice(details.getProPrice());
	product.setCreateAt(LocalDateTime.now());
	product.setCreateBy(System.getProperty("user.name"));
	products.add(product);
	}
	return products;

}
}