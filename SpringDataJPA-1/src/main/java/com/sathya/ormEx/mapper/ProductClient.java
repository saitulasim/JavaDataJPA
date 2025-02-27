package com.sathya.ormEx.mapper;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sathya.ormEx.entity.Product;
import com.sathya.ormEx.model.ProductDetails;
import com.sathya.ormEx.repository.ProductRepository;

@Component
public class ProductClient implements CommandLineRunner {
@Autowired
ProductRepository productRepository;
@Autowired
ProductMapper mapper;

	@Override
	public void run(String... args) throws Exception {
		//model class data : having the values
		ProductDetails productDetails = new ProductDetails();
		productDetails.setProId(101);
		productDetails.setProName("tv");
		productDetails.setProPrice(33000.76);
		//conversion of model class data to entity
		Product product = mapper.modelToEntityConversion(productDetails);
		productRepository.save(product);
		ProductDetails p1 = new ProductDetails();
		p1.setProId(11);
		p1.setProName("suger");
		p1.setProPrice(90);
		ProductDetails p2 = new ProductDetails();
		p2.setProId(282);
		p2.setProName("salt");
		p2.setProPrice(80);
		List<ProductDetails> proDetails = List.of(p1,p2);
		//conversion process
		List<Product> products = mapper.modelToEntityConversion(proDetails);
		productRepository.saveAll(products);
		Optional<Product> optional = productRepository.findById(111);
		
		List<Product> products2 =productRepository.findAll();
		
		long Count =productRepository.count();
		boolean status =productRepository.existsById(111);
		System.out.println(status);
		productRepository.deleteById(11);
		productRepository.deleteAll();
	}

}
