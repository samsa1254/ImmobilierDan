package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import tn.esprit.spring.entities.Product;
import tn.esprit.spring.service.IProductService;

@RestController
@Api(tags = "Product")
@RequestMapping("/Product/")
public class ProductController {


	@Autowired
	private IProductService SS;
	
	@PostMapping("/AddProduct")
	@ResponseBody 
	public Product addProduct(@RequestBody Product Product)
	{
		Product o= SS.addProduct(Product);
		return o ; 
		
	}
	
	@DeleteMapping("/DeleteProduct/{id}")
	@ResponseBody 
	public void deleteProduct(@PathVariable("id") long id)
	{
		
		SS.deleteProductByid(id); 
		
	}
	
	@GetMapping("/AllProduct")
	@ResponseBody
	public List<Product> Showall(){
		List<Product> p = SS.retrieveProducts();
		return p;
	}
	
	@PutMapping("/EditProduct")
	@ResponseBody
	public Product Update(@RequestBody Product s){
		Product p = SS.EditProduct(s);
		return p;
	}	
}
