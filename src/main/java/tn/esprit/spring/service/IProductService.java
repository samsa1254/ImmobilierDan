package tn.esprit.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Product;

@Service
public interface IProductService {
	public Product addProduct(Product Product);
	public Product EditProduct(Product Product);
	public void deleteProductByid(Long id);
	public List<Product> retrieveProducts();
	public Product retrieveProductById(Long id);
}
