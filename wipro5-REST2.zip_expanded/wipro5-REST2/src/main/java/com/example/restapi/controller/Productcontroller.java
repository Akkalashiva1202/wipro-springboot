package com.example.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.model.Product;

@RestController
@RequestMapping("products")
public class Productcontroller {

	//Each end point should have an unique endpoint
	
	//while u r giving response to the end user ensure  u give  response entity
	
	
	//  http://localhost:1234/products
//	@GetMapping
//	public String msg()
//	{
//		return "get Mapping";
//	} making it as reponse entity
	
	//-----------------------
//	@GetMapping
//	public ResponseEntity<String> msg()
//	{ 
//		return new ResponseEntity<String>("get Mapping",HttpStatus.FOUND);
//	}
//
//	//  http://localhost:1234/products/abc
////	@GetMapping("/abc")
////	public String msg2()
////	{
////		return "get Mapping 2";
////	}
//	
////	@GetMapping("/abc")
////	public Product msg2()
////	{
////		return new Product(4, 1000, 1, "petrol");
////	}  it is not recommended
//	
//	@GetMapping("/abc")
//	public ResponseEntity<Product> msg2()
//	{
//		return new ResponseEntity<Product>(new Product(4, 1000, 1, "petrol"),HttpStatus.FOUND);
//	}
//
//	@PostMapping
//	public String postmsg()
//	{
//		return "Post mapping";
//	}
//
//
//	//  http://localhost:1234/products/name/shiva,ram ...etc
//	@GetMapping("/name/{username}")
//	public String msg2(@PathVariable String username)
//	{
//		return "get Mapping welcome  "+username;
//	}

	
	ArrayList<Product> products = new ArrayList<>();
	 Productcontroller(){
		products.add(new Product(1, 500, 1, "book"));
		products.add(new Product(2, 200, 1, "pen"));
		products.add(new Product(3, 100, 1, "box"));
		products.add(new Product(4, 300, 1, "pencil"));
		products.add(new Product(5, 400, 1, "pad"));
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> getproducts()
	{
		return new ResponseEntity<List<Product>>(products,HttpStatus.FOUND);
	}
	
	@GetMapping("{productname}")
	public ResponseEntity<Product>getproduct(@PathVariable String productname)
	{
		System.out.println(productname);
		for(Product p : products)
		{
			if(p.getName().equals(productname))
			{
				
				return new ResponseEntity<Product>(p,HttpStatus.FOUND);
			}
		}
		Product  p  = new Product();
		return new ResponseEntity<Product>(p,HttpStatus.NOT_FOUND);
		}
	
	//---------------------postmapping
	@PostMapping
	public ResponseEntity<Product> postproduct(@RequestBody Product product)
	{
		products.add(product);
		return new ResponseEntity<Product>(product,HttpStatus.CREATED);
	}
	
	@DeleteMapping("{prodid}")
	public ResponseEntity<Product> deleteprod(@PathVariable int prodid)
	{
		Product deletedprod = new Product();
		for(Product p : products)
		{
			if(p.getProdid() == prodid)
			{
				deletedprod = p;
				products.remove(deletedprod);
				return new ResponseEntity<Product>(deletedprod,HttpStatus.OK);
			}
		}
		deletedprod.setName("product not found ");
		return new ResponseEntity<Product>(deletedprod,HttpStatus.OK);
		
	}
	@DeleteMapping("name/{name}")
	public ResponseEntity<Product> deleteprod(@PathVariable String name)
	{
		Product deletedprod = new Product();
		for(Product p : products)
		{
			if(p.getName().equals(name))
			{
				deletedprod = p;
				products.remove(deletedprod);
				return new ResponseEntity<Product>(deletedprod,HttpStatus.OK);
			}
		}
		deletedprod.setName("product not found ");
		return new ResponseEntity<Product>(deletedprod,HttpStatus.OK);
		
	}
	
	@PutMapping
	public ResponseEntity<Product> putproduct(@RequestBody Product product)
	{
		Product p1 = new Product();
		for(Product p : products)
		{
			if(p.getProdid() == product.getProdid())
			{
				products.remove(p);
				products.add(product);
				return new ResponseEntity<Product>(p,HttpStatus.OK);
			}
		}
		p1.setName("product not found ");
		return new ResponseEntity<Product>(p1,HttpStatus.OK);
	}
}
