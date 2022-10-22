package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entities.Product;
import tn.esprit.spring.entities.Product;
import tn.esprit.spring.repository.ProductRepository;

public class ProductServiceImpl implements IProductService{

	@Autowired
	private ProductRepository SR;

	@Override
	public Product addProduct(Product Product) {
		return SR.save(Product);
	}

	@Override
	public Product EditProduct(Product Product) {
		return SR.save(Product);
	}

	@Override
	public void deleteProductByid(Long id) {
		SR.deleteById(id);	
	}

	@Override
	public List<Product> retrieveProducts() {
		List<Product> s = (List<Product>) SR.findAll();
		return s;
	}

	@Override
	public Product retrieveProductById(Long id) {
		return SR.findById(id).get();
	}
	
	

	
}
