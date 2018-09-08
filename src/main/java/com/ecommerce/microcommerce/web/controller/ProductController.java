package com.ecommerce.microcommerce.web.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;

@RestController
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping(value="/Produits", method=RequestMethod.GET)
	public List<Product> listeProduits() {
		return productDao.findAll();
	}
	
	@GetMapping(value = "/Produits/{id}")
	public Product afficherUnProduit(@PathVariable int id) {
		 //Product product= new Product(id, new String("Aspirateur"), 100 );
		 return productDao.findById(id);
	}
}